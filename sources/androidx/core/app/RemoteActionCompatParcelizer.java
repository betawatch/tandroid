package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import b5.b;
import b5.c;
import b5.d;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(b bVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        d dVar = remoteActionCompat.a;
        boolean z9 = true;
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
        boolean z10 = remoteActionCompat.e;
        if (bVar.e(5)) {
            z10 = ((c) bVar).e.readInt() != 0;
        }
        remoteActionCompat.e = z10;
        boolean z11 = remoteActionCompat.f;
        if (!bVar.e(6)) {
            z9 = z11;
        } else if (((c) bVar).e.readInt() == 0) {
            z9 = false;
        }
        remoteActionCompat.f = z9;
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
        boolean z9 = remoteActionCompat.e;
        bVar.i(5);
        parcel.writeInt(z9 ? 1 : 0);
        boolean z10 = remoteActionCompat.f;
        bVar.i(6);
        parcel.writeInt(z10 ? 1 : 0);
    }
}
