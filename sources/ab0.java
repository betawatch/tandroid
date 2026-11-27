// default package

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import java.util.ArrayList;
import org.telegram.messenger.FilesMigrationService;
import org.telegram.messenger.a;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class ab0 extends nx0 {
    public final /* synthetic */ byte l1 = 1;
    public e m1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab0(ob0 ob0Var, Activity activity) {
        super(activity, true);
        this.m1 = ob0Var;
    }

    @Override // nx0
    public final boolean D() {
        switch (this.l1) {
            case 1:
                return false;
            default:
                return super.D();
        }
    }

    @Override // nx0
    public final boolean E() {
        switch (this.l1) {
            case 1:
                return false;
            default:
                return super.E();
        }
    }

    public final void E0() {
        Activity parentActivity = ((uj3) this.m1).getParentActivity();
        boolean z = false;
        boolean z2 = parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
        int i = Build.VERSION.SDK_INT;
        if ((i >= 33 && parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0 && parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") == 0 && parentActivity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") == 0) || (i < 33 && parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0)) {
            z = true;
        }
        if (z && z2) {
            boolean z3 = FilesMigrationService.c;
            a.b.startService(new Intent(a.b, (Class<?>) FilesMigrationService.class));
            dismiss();
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (!z) {
            if (i >= 33) {
                arrayList.add("android.permission.READ_MEDIA_IMAGES");
                arrayList.add("android.permission.READ_MEDIA_VIDEO");
                arrayList.add("android.permission.READ_MEDIA_AUDIO");
            } else {
                arrayList.add("android.permission.READ_EXTERNAL_STORAGE");
            }
        }
        if (!z2) {
            arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
        }
        parentActivity.requestPermissions((String[]) arrayList.toArray(new String[arrayList.size()]), 4);
    }

    @Override // nx0
    public final void H() {
        switch (this.l1) {
            case 0:
                super.H();
                ob0 ob0Var = (ob0) this.m1;
                hl.V2(ob0Var.getParentActivity(), ob0Var.getClassGuid());
                ob0Var.T = null;
                break;
            default:
                super.H();
                break;
        }
    }

    @Override // nx0, android.app.Dialog, android.content.DialogInterface, ag0
    public final void dismiss() {
        switch (this.l1) {
            case 0:
                super.dismiss();
                ob0 ob0Var = (ob0) this.m1;
                ob0Var.K.A1(ob0Var.Z);
                ob0Var.f = true;
                ob0Var.fragmentView.invalidate();
                ob0Var.e.animate().setListener(new h0(this, (byte) 15)).alpha(0.0f).setDuration(200L).start();
                break;
            default:
                super.dismiss();
                FilesMigrationService.e = null;
                break;
        }
    }

    public /* synthetic */ ab0(Context context, boolean z) {
        super(context, z);
    }
}
