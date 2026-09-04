package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import y4.b;
import y4.c;
import y4.d;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(b bVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        d dVar = remoteActionCompat.a;
        boolean z10 = true;
        if (bVar.e(1)) {
            dVar = bVar.h();
        }
        remoteActionCompat.a = (IconCompat) dVar;
        CharSequence charSequence = remoteActionCompat.b;
        if (bVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((c) bVar).e);
        }
        remoteActionCompat.b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.c;
        if (bVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((c) bVar).e);
        }
        remoteActionCompat.c = charSequence2;
        remoteActionCompat.d = (PendingIntent) bVar.g(remoteActionCompat.d, 4);
        boolean z11 = remoteActionCompat.e;
        if (bVar.e(5)) {
            z11 = ((c) bVar).e.readInt() != 0;
        }
        remoteActionCompat.e = z11;
        boolean z12 = remoteActionCompat.f;
        if (!bVar.e(6)) {
            z10 = z12;
        } else if (((c) bVar).e.readInt() == 0) {
            z10 = false;
        }
        remoteActionCompat.f = z10;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, b bVar) {
        bVar.getClass();
        IconCompat iconCompat = remoteActionCompat.a;
        bVar.i(1);
        bVar.l(iconCompat);
        CharSequence charSequence = remoteActionCompat.b;
        bVar.i(2);
        Parcel parcel = ((c) bVar).e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.c;
        bVar.i(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        bVar.k(remoteActionCompat.d, 4);
        boolean z10 = remoteActionCompat.e;
        bVar.i(5);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = remoteActionCompat.f;
        bVar.i(6);
        parcel.writeInt(z11 ? 1 : 0);
    }
}
