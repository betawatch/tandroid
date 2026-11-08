package org.telegram.messenger;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import java.util.ArrayList;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class c9 extends org.telegram.ui.ActionBar.v2 {
    public final /* synthetic */ int i1 = 0;
    public org.telegram.ui.ActionBar.f2 j1;

    public /* synthetic */ c9(Context context, boolean z9) {
        super(context, z9);
    }

    @Override // org.telegram.ui.ActionBar.v2
    public boolean G() {
        switch (this.i1) {
            case 0:
                return false;
            default:
                return super.G();
        }
    }

    @Override // org.telegram.ui.ActionBar.v2
    public boolean H() {
        switch (this.i1) {
            case 0:
                return false;
            default:
                return super.H();
        }
    }

    public void I0() {
        Activity parentActivity = ((org.telegram.ui.ww) this.j1).getParentActivity();
        boolean z9 = false;
        boolean z10 = parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
        int i7 = Build.VERSION.SDK_INT;
        if ((i7 >= 33 && parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0 && parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") == 0 && parentActivity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") == 0) || (i7 < 33 && parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0)) {
            z9 = true;
        }
        if (z9 && z10) {
            boolean z11 = FilesMigrationService.c;
            t0.b.startService(new Intent(t0.b, (Class<?>) FilesMigrationService.class));
            dismiss();
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (!z9) {
            if (i7 >= 33) {
                arrayList.add("android.permission.READ_MEDIA_IMAGES");
                arrayList.add("android.permission.READ_MEDIA_VIDEO");
                arrayList.add("android.permission.READ_MEDIA_AUDIO");
            } else {
                arrayList.add("android.permission.READ_EXTERNAL_STORAGE");
            }
        }
        if (!z10) {
            arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
        }
        parentActivity.requestPermissions((String[]) arrayList.toArray(new String[arrayList.size()]), 4);
    }

    @Override // org.telegram.ui.ActionBar.v2
    public void K() {
        switch (this.i1) {
            case 1:
                super.K();
                org.telegram.ui.Components.t8 t8Var = (org.telegram.ui.Components.t8) this.j1;
                g0.a3(t8Var.getParentActivity(), t8Var.getClassGuid());
                t8Var.S = null;
                break;
            default:
                super.K();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    public final void dismiss() {
        switch (this.i1) {
            case 0:
                super.dismiss();
                FilesMigrationService.e = null;
                break;
            default:
                super.dismiss();
                org.telegram.ui.Components.t8 t8Var = (org.telegram.ui.Components.t8) this.j1;
                t8Var.J.z1(t8Var.Y);
                t8Var.f = true;
                t8Var.fragmentView.invalidate();
                t8Var.e.animate().setListener(new org.telegram.ui.Components.z5(this, 4)).alpha(0.0f).setDuration(200L).start();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c9(org.telegram.ui.Components.t8 t8Var, Activity activity) {
        super(activity, true);
        this.j1 = t8Var;
    }
}
