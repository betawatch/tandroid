package org.telegram.messenger;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import java.util.ArrayList;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class c9 extends org.telegram.ui.ActionBar.w2 {
    public final /* synthetic */ int l1 = 0;
    public org.telegram.ui.ActionBar.f2 m1;

    public /* synthetic */ c9(Context context, boolean z9) {
        super(context, z9);
    }

    @Override // org.telegram.ui.ActionBar.w2
    public boolean G() {
        switch (this.l1) {
            case 0:
                return false;
            default:
                return super.G();
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public boolean H() {
        switch (this.l1) {
            case 0:
                return false;
            default:
                return super.H();
        }
    }

    public void I0() {
        Activity parentActivity = ((org.telegram.ui.zw) this.m1).getParentActivity();
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

    @Override // org.telegram.ui.ActionBar.w2
    public void K() {
        switch (this.l1) {
            case 1:
                super.K();
                org.telegram.ui.Components.s8 s8Var = (org.telegram.ui.Components.s8) this.m1;
                g0.a3(s8Var.getParentActivity(), s8Var.getClassGuid());
                s8Var.S = null;
                break;
            default:
                super.K();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    public final void dismiss() {
        switch (this.l1) {
            case 0:
                super.dismiss();
                FilesMigrationService.e = null;
                break;
            default:
                super.dismiss();
                org.telegram.ui.Components.s8 s8Var = (org.telegram.ui.Components.s8) this.m1;
                s8Var.J.z1(s8Var.Y);
                s8Var.f = true;
                s8Var.fragmentView.invalidate();
                s8Var.e.animate().setListener(new org.telegram.ui.Components.y5(this, 4)).alpha(0.0f).setDuration(200L).start();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c9(org.telegram.ui.Components.s8 s8Var, Activity activity) {
        super(activity, true);
        this.m1 = s8Var;
    }
}
