package android.support.v4.media.session;

import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new b0(4);
    public final int a;
    public final long b;
    public final long c;
    public final float d;
    public final long e;
    public final int f;
    public final CharSequence h;
    public final long n;
    public final ArrayList r;
    public final long s;
    public final Bundle v;
    public PlaybackState w;

    public PlaybackStateCompat(int i10, long j3, long j10, float f7, long j11, int i11, CharSequence charSequence, long j12, ArrayList arrayList, long j13, Bundle bundle) {
        this.a = i10;
        this.b = j3;
        this.c = j10;
        this.d = f7;
        this.e = j11;
        this.f = i11;
        this.h = charSequence;
        this.n = j12;
        this.r = new ArrayList(arrayList);
        this.s = j13;
        this.v = bundle;
    }

    public static PlaybackStateCompat a(PlaybackState playbackState) {
        ArrayList arrayList;
        CustomAction customAction;
        Bundle bundle = null;
        if (playbackState == null) {
            return null;
        }
        List<PlaybackState.CustomAction> j3 = d0.j(playbackState);
        if (j3 != null) {
            ArrayList arrayList2 = new ArrayList(j3.size());
            for (PlaybackState.CustomAction customAction2 : j3) {
                if (customAction2 != null) {
                    PlaybackState.CustomAction customAction3 = customAction2;
                    Bundle l4 = d0.l(customAction3);
                    c0.a(l4);
                    customAction = new CustomAction(d0.f(customAction3), d0.o(customAction3), d0.m(customAction3), l4);
                    customAction.e = customAction3;
                } else {
                    customAction = null;
                }
                arrayList2.add(customAction);
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        if (Build.VERSION.SDK_INT >= 22) {
            bundle = e0.a(playbackState);
            c0.a(bundle);
        }
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(d0.r(playbackState), d0.q(playbackState), d0.i(playbackState), d0.p(playbackState), d0.g(playbackState), 0, d0.k(playbackState), d0.n(playbackState), arrayList, d0.h(playbackState), bundle);
        playbackStateCompat.w = playbackState;
        return playbackStateCompat;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlaybackState {state=");
        sb2.append(this.a);
        sb2.append(", position=");
        sb2.append(this.b);
        sb2.append(", buffered position=");
        sb2.append(this.c);
        sb2.append(", speed=");
        sb2.append(this.d);
        sb2.append(", updated=");
        sb2.append(this.n);
        sb2.append(", actions=");
        sb2.append(this.e);
        sb2.append(", error code=");
        sb2.append(this.f);
        sb2.append(", error message=");
        sb2.append(this.h);
        sb2.append(", custom actions=");
        sb2.append(this.r);
        sb2.append(", active item id=");
        return a4.a.r(sb2, this.s, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.a);
        parcel.writeLong(this.b);
        parcel.writeFloat(this.d);
        parcel.writeLong(this.n);
        parcel.writeLong(this.c);
        parcel.writeLong(this.e);
        TextUtils.writeToParcel(this.h, parcel, i10);
        parcel.writeTypedList(this.r);
        parcel.writeLong(this.s);
        parcel.writeBundle(this.v);
        parcel.writeInt(this.f);
    }

    /* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new g0();
        public final String a;
        public final CharSequence b;
        public final int c;
        public final Bundle d;
        public PlaybackState.CustomAction e;

        public CustomAction(String str, CharSequence charSequence, int i10, Bundle bundle) {
            this.a = str;
            this.b = charSequence;
            this.c = i10;
            this.d = bundle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.b) + ", mIcon=" + this.c + ", mExtras=" + this.d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.a);
            TextUtils.writeToParcel(this.b, parcel, i10);
            parcel.writeInt(this.c);
            parcel.writeBundle(this.d);
        }

        public CustomAction(Parcel parcel) {
            this.a = parcel.readString();
            this.b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.c = parcel.readInt();
            this.d = parcel.readBundle(c0.class.getClassLoader());
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readLong();
        this.d = parcel.readFloat();
        this.n = parcel.readLong();
        this.c = parcel.readLong();
        this.e = parcel.readLong();
        this.h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.r = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.s = parcel.readLong();
        this.v = parcel.readBundle(c0.class.getClassLoader());
        this.f = parcel.readInt();
    }
}
