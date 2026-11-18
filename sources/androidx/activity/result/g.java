package androidx.activity.result;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new w.a(15);
    public final IntentSender a;
    public final Intent b;
    public final int c;
    public final int d;

    public g(IntentSender intentSender, Intent intent, int i7, int i10) {
        j.e(intentSender, "intentSender");
        this.a = intentSender;
        this.b = intent;
        this.c = i7;
        this.d = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i7) {
        j.e(dest, "dest");
        dest.writeParcelable(this.a, i7);
        dest.writeParcelable(this.b, i7);
        dest.writeInt(this.c);
        dest.writeInt(this.d);
    }
}
