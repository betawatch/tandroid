package android.support.v4.media.session;

import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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

    public PlaybackStateCompat(int i10, long j10, long j11, float f10, long j12, int i11, CharSequence charSequence, long j13, ArrayList arrayList, long j14, Bundle bundle) {
        this.a = i10;
        this.b = j10;
        this.c = j11;
        this.d = f10;
        this.e = j12;
        this.f = i11;
        this.h = charSequence;
        this.n = j13;
        this.r = new ArrayList(arrayList);
        this.s = j14;
        this.v = bundle;
    }

    public static PlaybackStateCompat a(PlaybackState playbackState) {
        ArrayList arrayList;
        CustomAction customAction;
        Bundle bundle = null;
        if (playbackState == null) {
            return null;
        }
        List<PlaybackState.CustomAction> j10 = d0.j(playbackState);
        if (j10 != null) {
            ArrayList arrayList2 = new ArrayList(j10.size());
            for (PlaybackState.CustomAction customAction2 : j10) {
                if (customAction2 != null) {
                    PlaybackState.CustomAction customAction3 = customAction2;
                    Bundle l10 = d0.l(customAction3);
                    c0.a(l10);
                    customAction = new CustomAction(d0.f(customAction3), d0.o(customAction3), d0.m(customAction3), l10);
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
        StringBuilder sb = new StringBuilder("PlaybackState {state=");
        sb.append(this.a);
        sb.append(", position=");
        sb.append(this.b);
        sb.append(", buffered position=");
        sb.append(this.c);
        sb.append(", speed=");
        sb.append(this.d);
        sb.append(", updated=");
        sb.append(this.n);
        sb.append(", actions=");
        sb.append(this.e);
        sb.append(", error code=");
        sb.append(this.f);
        sb.append(", error message=");
        sb.append(this.h);
        sb.append(", custom actions=");
        sb.append(this.r);
        sb.append(", active item id=");
        return android.support.v4.media.a.q(sb, this.s, "}");
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

    /* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
