package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(ydc ydcVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        aec aecVar = remoteActionCompat.a;
        boolean z = true;
        if (ydcVar.e(1)) {
            aecVar = ydcVar.h();
        }
        remoteActionCompat.a = (IconCompat) aecVar;
        CharSequence charSequence = remoteActionCompat.b;
        if (ydcVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((zdc) ydcVar).e);
        }
        remoteActionCompat.b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.c;
        if (ydcVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((zdc) ydcVar).e);
        }
        remoteActionCompat.c = charSequence2;
        remoteActionCompat.d = (PendingIntent) ydcVar.g(remoteActionCompat.d, 4);
        boolean z2 = remoteActionCompat.e;
        if (ydcVar.e(5)) {
            z2 = ((zdc) ydcVar).e.readInt() != 0;
        }
        remoteActionCompat.e = z2;
        boolean z3 = remoteActionCompat.f;
        if (!ydcVar.e(6)) {
            z = z3;
        } else if (((zdc) ydcVar).e.readInt() == 0) {
            z = false;
        }
        remoteActionCompat.f = z;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, ydc ydcVar) {
        ydcVar.getClass();
        IconCompat iconCompat = remoteActionCompat.a;
        ydcVar.i(1);
        ydcVar.l(iconCompat);
        CharSequence charSequence = remoteActionCompat.b;
        ydcVar.i(2);
        Parcel parcel = ((zdc) ydcVar).e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.c;
        ydcVar.i(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        ydcVar.k(remoteActionCompat.d, 4);
        boolean z = remoteActionCompat.e;
        ydcVar.i(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f;
        ydcVar.i(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
