package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(y9c y9cVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        aac aacVar = remoteActionCompat.a;
        boolean z = true;
        if (y9cVar.e(1)) {
            aacVar = y9cVar.h();
        }
        remoteActionCompat.a = (IconCompat) aacVar;
        CharSequence charSequence = remoteActionCompat.b;
        if (y9cVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((z9c) y9cVar).e);
        }
        remoteActionCompat.b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.c;
        if (y9cVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((z9c) y9cVar).e);
        }
        remoteActionCompat.c = charSequence2;
        remoteActionCompat.d = (PendingIntent) y9cVar.g(remoteActionCompat.d, 4);
        boolean z2 = remoteActionCompat.e;
        if (y9cVar.e(5)) {
            z2 = ((z9c) y9cVar).e.readInt() != 0;
        }
        remoteActionCompat.e = z2;
        boolean z3 = remoteActionCompat.f;
        if (!y9cVar.e(6)) {
            z = z3;
        } else if (((z9c) y9cVar).e.readInt() == 0) {
            z = false;
        }
        remoteActionCompat.f = z;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, y9c y9cVar) {
        y9cVar.getClass();
        IconCompat iconCompat = remoteActionCompat.a;
        y9cVar.i(1);
        y9cVar.l(iconCompat);
        CharSequence charSequence = remoteActionCompat.b;
        y9cVar.i(2);
        Parcel parcel = ((z9c) y9cVar).e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.c;
        y9cVar.i(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        y9cVar.k(remoteActionCompat.d, 4);
        boolean z = remoteActionCompat.e;
        y9cVar.i(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f;
        y9cVar.i(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
