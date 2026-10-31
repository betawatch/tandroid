package org.telegram.messenger;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class h9 extends org.telegram.ui.ActionBar.z2 {
    public final /* synthetic */ int i1 = 0;
    public org.telegram.ui.ActionBar.k2 j1;

    public /* synthetic */ h9(Context context, boolean z10) {
        super(context, z10);
    }

    @Override // org.telegram.ui.ActionBar.z2
    public boolean H() {
        switch (this.i1) {
            case 0:
                return false;
            default:
                return super.H();
        }
    }

    @Override // org.telegram.ui.ActionBar.z2
    public boolean I() {
        switch (this.i1) {
            case 0:
                return false;
            default:
                return super.I();
        }
    }

    public void I0() {
        Activity parentActivity = ((org.telegram.ui.ay) this.j1).getParentActivity();
        boolean z10 = false;
        boolean z11 = parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
        int i10 = Build.VERSION.SDK_INT;
        if ((i10 >= 33 && parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0 && parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") == 0 && parentActivity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") == 0) || (i10 < 33 && parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0)) {
            z10 = true;
        }
        if (z10 && z11) {
            boolean z12 = FilesMigrationService.c;
            w0.b.startService(new Intent(w0.b, (Class<?>) FilesMigrationService.class));
            dismiss();
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (!z10) {
            if (i10 >= 33) {
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

    @Override // org.telegram.ui.ActionBar.z2
    public void L() {
        switch (this.i1) {
            case 1:
                super.L();
                org.telegram.ui.Components.o8 o8Var = (org.telegram.ui.Components.o8) this.j1;
                i0.Z2(o8Var.getParentActivity(), o8Var.getClassGuid());
                o8Var.S = null;
                break;
            default:
                super.L();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.g2
    public final void dismiss() {
        switch (this.i1) {
            case 0:
                super.dismiss();
                FilesMigrationService.e = null;
                break;
            default:
                super.dismiss();
                org.telegram.ui.Components.o8 o8Var = (org.telegram.ui.Components.o8) this.j1;
                o8Var.J.z1(o8Var.Y);
                o8Var.f = true;
                o8Var.fragmentView.invalidate();
                o8Var.e.animate().setListener(new org.telegram.ui.Components.w5(this, 4)).alpha(0.0f).setDuration(200L).start();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h9(org.telegram.ui.Components.o8 o8Var, Activity activity) {
        super(activity, true);
        this.j1 = o8Var;
    }
}
