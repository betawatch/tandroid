package androidx.media;

import android.media.VolumeProvider;
import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat$MediaSessionImplApi21$$ExternalSyntheticApiModelOutline8;

/* loaded from: classes.dex */
public abstract class VolumeProviderCompat {
    private Callback mCallback;
    private final String mControlId;
    private final int mControlType;
    private int mCurrentVolume;
    private final int mMaxVolume;
    private VolumeProvider mVolumeProviderFwk;

    private static class Api21Impl {
        static void setCurrentVolume(VolumeProvider volumeProvider, int i) {
            volumeProvider.setCurrentVolume(i);
        }
    }

    public static abstract class Callback {
        public abstract void onVolumeChanged(VolumeProviderCompat volumeProviderCompat);
    }

    public VolumeProviderCompat(int i, int i2, int i3, String str) {
        this.mControlType = i;
        this.mMaxVolume = i2;
        this.mCurrentVolume = i3;
        this.mControlId = str;
    }

    public final int getCurrentVolume() {
        return this.mCurrentVolume;
    }

    public final int getMaxVolume() {
        return this.mMaxVolume;
    }

    public final int getVolumeControl() {
        return this.mControlType;
    }

    public Object getVolumeProvider() {
        VolumeProvider volumeProvider;
        if (this.mVolumeProviderFwk == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                volumeProvider = new VolumeProvider(this.mControlType, this.mMaxVolume, this.mCurrentVolume, this.mControlId) { // from class: androidx.media.VolumeProviderCompat.1
                    @Override // android.media.VolumeProvider
                    public void onAdjustVolume(int i2) {
                        VolumeProviderCompat.this.onAdjustVolume(i2);
                    }

                    @Override // android.media.VolumeProvider
                    public void onSetVolumeTo(int i2) {
                        VolumeProviderCompat.this.onSetVolumeTo(i2);
                    }
                };
            } else if (i >= 21) {
                volumeProvider = new VolumeProvider(this.mControlType, this.mMaxVolume, this.mCurrentVolume) { // from class: androidx.media.VolumeProviderCompat.2
                    @Override // android.media.VolumeProvider
                    public void onAdjustVolume(int i2) {
                        VolumeProviderCompat.this.onAdjustVolume(i2);
                    }

                    @Override // android.media.VolumeProvider
                    public void onSetVolumeTo(int i2) {
                        VolumeProviderCompat.this.onSetVolumeTo(i2);
                    }
                };
            }
            this.mVolumeProviderFwk = volumeProvider;
        }
        return this.mVolumeProviderFwk;
    }

    public abstract void onAdjustVolume(int i);

    public abstract void onSetVolumeTo(int i);

    public void setCallback(Callback callback) {
        this.mCallback = callback;
    }

    public final void setCurrentVolume(int i) {
        this.mCurrentVolume = i;
        if (Build.VERSION.SDK_INT >= 21) {
            Api21Impl.setCurrentVolume(MediaSessionCompat$MediaSessionImplApi21$$ExternalSyntheticApiModelOutline8.m(getVolumeProvider()), i);
        }
        Callback callback = this.mCallback;
        if (callback != null) {
            callback.onVolumeChanged(this);
        }
    }
}
