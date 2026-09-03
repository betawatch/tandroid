package b6;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiActivity;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class s implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Intent b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s(Intent intent, Object obj, int i10) {
        this.a = i10;
        this.b = intent;
        this.c = obj;
    }

    public final void a() {
        switch (this.a) {
            case 0:
                Intent intent = this.b;
                if (intent != null) {
                    ((GoogleApiActivity) this.c).startActivityForResult(intent, 2);
                    break;
                }
                break;
            default:
                Intent intent2 = this.b;
                if (intent2 != null) {
                    ((com.google.android.gms.common.api.internal.m) this.c).startActivityForResult(intent2, 2);
                    break;
                }
                break;
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        try {
            try {
                a();
            } catch (ActivityNotFoundException e) {
                Log.e("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e);
            }
        } finally {
            dialogInterface.dismiss();
        }
    }
}
