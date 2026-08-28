package androidx.activity.result;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.i;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new w.a(7);
    public final IntentSender a;
    public final Intent b;
    public final int c;
    public final int d;

    public g(IntentSender intentSender, Intent intent, int i9, int i10) {
        i.e(intentSender, "intentSender");
        this.a = intentSender;
        this.b = intent;
        this.c = i9;
        this.d = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i9) {
        i.e(dest, "dest");
        dest.writeParcelable(this.a, i9);
        dest.writeParcelable(this.b, i9);
        dest.writeInt(this.c);
        dest.writeInt(this.d);
    }
}
