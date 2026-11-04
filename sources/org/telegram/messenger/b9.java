package org.telegram.messenger;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b9 extends org.telegram.ui.ActionBar.t2 {
    public final /* synthetic */ int j1 = 0;
    public org.telegram.ui.ActionBar.d2 k1;

    public /* synthetic */ b9(Context context, boolean z10) {
        super(context, z10);
    }

    @Override // org.telegram.ui.ActionBar.t2
    public boolean G() {
        switch (this.j1) {
            case 0:
                return false;
            default:
                return super.G();
        }
    }

    @Override // org.telegram.ui.ActionBar.t2
    public boolean H() {
        switch (this.j1) {
            case 0:
                return false;
            default:
                return super.H();
        }
    }

    public void I0() {
        Activity parentActivity = ((org.telegram.ui.uw) this.k1).getParentActivity();
        boolean z10 = false;
        boolean z11 = parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
        int i3 = Build.VERSION.SDK_INT;
        if ((i3 >= 33 && parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0 && parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") == 0 && parentActivity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") == 0) || (i3 < 33 && parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0)) {
            z10 = true;
        }
        if (z10 && z11) {
            boolean z12 = FilesMigrationService.c;
            t0.b.startService(new Intent(t0.b, (Class<?>) FilesMigrationService.class));
            dismiss();
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (!z10) {
            if (i3 >= 33) {
                arrayList.add("android.permission.READ_MEDIA_IMAGES");
                arrayList.add("android.permission.READ_MEDIA_VIDEO");
                arrayList.add("android.permission.READ_MEDIA_AUDIO");
            } else {
                arrayList.add("android.permission.READ_EXTERNAL_STORAGE");
            }
        }
        if (!z11) {
            arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
        }
        parentActivity.requestPermissions((String[]) arrayList.toArray(new String[arrayList.size()]), 4);
    }

    @Override // org.telegram.ui.ActionBar.t2
    public void K() {
        switch (this.j1) {
            case 1:
                super.K();
                org.telegram.ui.Components.r8 r8Var = (org.telegram.ui.Components.r8) this.k1;
                g0.a3(r8Var.getParentActivity(), r8Var.getClassGuid());
                r8Var.T = null;
                break;
            default:
                super.K();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.t2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.z1
    public final void dismiss() {
        switch (this.j1) {
            case 0:
                super.dismiss();
                FilesMigrationService.e = null;
                break;
            default:
                super.dismiss();
                org.telegram.ui.Components.r8 r8Var = (org.telegram.ui.Components.r8) this.k1;
                r8Var.K.z1(r8Var.Z);
                r8Var.f = true;
                r8Var.fragmentView.invalidate();
                r8Var.e.animate().setListener(new org.telegram.ui.Components.x5(this, 4)).alpha(0.0f).setDuration(200L).start();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b9(org.telegram.ui.Components.r8 r8Var, Activity activity) {
        super(activity, true);
        this.k1 = r8Var;
    }
}
