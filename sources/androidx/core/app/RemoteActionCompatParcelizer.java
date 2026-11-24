package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(zbc zbcVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        bcc bccVar = remoteActionCompat.a;
        boolean z = true;
        if (zbcVar.e(1)) {
            bccVar = zbcVar.h();
        }
        remoteActionCompat.a = (IconCompat) bccVar;
        CharSequence charSequence = remoteActionCompat.b;
        if (zbcVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((acc) zbcVar).e);
        }
        remoteActionCompat.b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.c;
        if (zbcVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((acc) zbcVar).e);
        }
        remoteActionCompat.c = charSequence2;
        remoteActionCompat.d = (PendingIntent) zbcVar.g(remoteActionCompat.d, 4);
        boolean z2 = remoteActionCompat.e;
        if (zbcVar.e(5)) {
            z2 = ((acc) zbcVar).e.readInt() != 0;
        }
        remoteActionCompat.e = z2;
        boolean z3 = remoteActionCompat.f;
        if (!zbcVar.e(6)) {
            z = z3;
        } else if (((acc) zbcVar).e.readInt() == 0) {
            z = false;
        }
        remoteActionCompat.f = z;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, zbc zbcVar) {
        zbcVar.getClass();
        IconCompat iconCompat = remoteActionCompat.a;
        zbcVar.i(1);
        zbcVar.l(iconCompat);
        CharSequence charSequence = remoteActionCompat.b;
        zbcVar.i(2);
        Parcel parcel = ((acc) zbcVar).e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.c;
        zbcVar.i(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        zbcVar.k(remoteActionCompat.d, 4);
        boolean z = remoteActionCompat.e;
        zbcVar.i(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f;
        zbcVar.i(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
