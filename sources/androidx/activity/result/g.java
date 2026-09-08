package androidx.activity.result;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.i;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new w.a(9);
    public final IntentSender a;
    public final Intent b;
    public final int c;
    public final int d;

    public g(IntentSender intentSender, Intent intent, int i10, int i11) {
        i.e(intentSender, "intentSender");
        this.a = intentSender;
        this.b = intent;
        this.c = i10;
        this.d = i11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        i.e(dest, "dest");
        dest.writeParcelable(this.a, i10);
        dest.writeParcelable(this.b, i10);
        dest.writeInt(this.c);
        dest.writeInt(this.d);
    }
}
