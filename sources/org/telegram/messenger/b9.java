package org.telegram.messenger;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import java.util.ArrayList;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class b9 extends org.telegram.ui.ActionBar.u2 {
    public final /* synthetic */ int m1 = 0;
    public org.telegram.ui.ActionBar.e2 n1;

    public /* synthetic */ b9(Context context, boolean z10) {
        super(context, z10);
    }

    @Override // org.telegram.ui.ActionBar.u2
    public boolean H() {
        switch (this.m1) {
            case 0:
                return false;
            default:
                return super.H();
        }
    }

    @Override // org.telegram.ui.ActionBar.u2
    public boolean I() {
        switch (this.m1) {
            case 0:
                return false;
            default:
                return super.I();
        }
    }

    public void I0() {
        Activity parentActivity = ((org.telegram.ui.yw) this.n1).getParentActivity();
        boolean z10 = false;
        boolean z11 = parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
        int i7 = Build.VERSION.SDK_INT;
        if ((i7 >= 33 && parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0 && parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") == 0 && parentActivity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") == 0) || (i7 < 33 && parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0)) {
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
            if (i7 >= 33) {
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

    @Override // org.telegram.ui.ActionBar.u2
    public void L() {
        switch (this.m1) {
            case 1:
                super.L();
                org.telegram.ui.Components.q8 q8Var = (org.telegram.ui.Components.q8) this.n1;
                g0.a3(q8Var.getParentActivity(), q8Var.getClassGuid());
                q8Var.T = null;
                break;
            default:
                super.L();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.u2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.a2
    public final void dismiss() {
        switch (this.m1) {
            case 0:
                super.dismiss();
                FilesMigrationService.e = null;
                break;
            default:
                super.dismiss();
                org.telegram.ui.Components.q8 q8Var = (org.telegram.ui.Components.q8) this.n1;
                q8Var.K.z1(q8Var.Z);
                q8Var.f = true;
                q8Var.fragmentView.invalidate();
                q8Var.e.animate().setListener(new org.telegram.ui.Components.x5(this, 4)).alpha(0.0f).setDuration(200L).start();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b9(org.telegram.ui.Components.q8 q8Var, Activity activity) {
        super(activity, true);
        this.n1 = q8Var;
    }
}
