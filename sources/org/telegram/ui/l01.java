package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Locale;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class l01 extends org.telegram.ui.ActionBar.k2 {
    public static final int[] d = {750000, 1000000, 1200000, 2000000};
    public final /* synthetic */ int a;
    public org.telegram.ui.Components.tk0 b;
    public org.telegram.ui.Components.sk0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l01(int i10, Bundle bundle) {
        super(bundle);
        this.a = i10;
    }

    public static void Y(l01 l01Var, int i10) {
        if (i10 != 1) {
            if (MediaController.s0(l01Var.currentAccount) && i10 == 2) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(l01Var.getParentActivity());
                alertDialog$Builder.a.R = org.telegram.messenger.cd.L0(2131753922, null);
                alertDialog$Builder.f(new CharSequence[]{org.telegram.messenger.cd.L0(2131753921, null), org.telegram.messenger.cd.L0(2131753920, null)}, new l4(l01Var, 0));
                l01Var.showDialog(alertDialog$Builder.a);
                return;
            }
            return;
        }
        mi.a aVar = mi.e.b;
        boolean z10 = !MediaController.s0(l01Var.currentAccount);
        synchronized (aVar) {
            aVar.d = z10;
            aVar.c = true;
            aVar.b = true;
            mi.d.a.edit().putBoolean("audio_recorder_v2_enabled", z10).apply();
        }
        ((fg.j) l01Var.c).f();
    }

    public static void Z(l01 l01Var, int i10) {
        if (i10 == 1) {
            mi.a aVar = mi.e.d;
            boolean z10 = !org.telegram.ui.Components.j50.d(l01Var.currentAccount);
            synchronized (aVar) {
                aVar.d = z10;
                aVar.c = true;
                aVar.b = true;
                mi.d.a.edit().putBoolean("round_video_camera2_enabled", z10).apply();
            }
            ((fg.j) l01Var.c).f();
            return;
        }
        if (!org.telegram.ui.Components.j50.d(l01Var.currentAccount)) {
            return;
        }
        int i11 = 0;
        if (i10 == 2) {
            l01Var.f0(2131746003, new CharSequence[]{"480p", "360p"}, new org.telegram.ui.Components.z11(26));
            return;
        }
        if (i10 == 3) {
            l01Var.f0(2131746013, new CharSequence[]{org.telegram.messenger.cd.L0(2131746012, null), org.telegram.messenger.cd.L0(2131746010, null), org.telegram.messenger.cd.L0(2131746011, null)}, new org.telegram.ui.Components.z11(27));
            return;
        }
        if (i10 == 4) {
            l01Var.f0(2131746006, new CharSequence[]{"30 FPS", "60 FPS"}, new org.telegram.ui.Components.z11(28));
            return;
        }
        if (i10 != 5) {
            if (i10 == 8) {
                mi.a aVar2 = mi.e.i;
                aVar2.a();
                aVar2.b(true ^ aVar2.d);
                ((fg.j) l01Var.c).g(i10);
                return;
            }
            return;
        }
        CharSequence[] charSequenceArr = new CharSequence[4];
        while (true) {
            int[] iArr = d;
            if (i11 >= 3) {
                l01Var.f0(2131746014, charSequenceArr, new org.telegram.ui.Components.z11(29));
                return;
            } else {
                charSequenceArr[i11] = e0(iArr[i11]);
                i11++;
            }
        }
    }

    public static String e0(int i10) {
        if (i10 % 1000000 == 0) {
            return (i10 / 1000000) + " Mbps";
        }
        if (i10 > 1000000) {
            return String.format(Locale.US, "%.1f Mbps", Float.valueOf(i10 / 1000000.0f));
        }
        return (i10 / 1000) + " kbps";
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        int i10 = 2;
        int i11 = 1;
        switch (this.a) {
            case 0:
                setHasOwnBackground(true);
                this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
                this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131746002, null));
                this.simpleActionBar.setActionBarMenuOnItemClick(new t60(this, 28));
                FrameLayout frameLayout = new FrameLayout(context);
                this.fragmentView = frameLayout;
                org.telegram.ui.Components.tk0 tk0Var = new org.telegram.ui.Components.tk0(context, null);
                this.b = tk0Var;
                tk0Var.r1();
                this.b.setSectionsDrawBackground(true);
                this.b.setLayoutManager(new s4.a0());
                this.b.setVerticalScrollBarEnabled(false);
                org.telegram.ui.Components.tk0 tk0Var2 = this.b;
                fg.j jVar = new fg.j(18, this, context);
                this.c = jVar;
                tk0Var2.setAdapter(jVar);
                this.b.setOnItemClickListener(new kz0(this, i10));
                frameLayout.addView(this.b, w7.b6.c(-1.0f, -1));
                break;
            default:
                setHasOwnBackground(true);
                this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
                this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131753919, null));
                this.simpleActionBar.setActionBarMenuOnItemClick(new ag.e(this, 13));
                FrameLayout frameLayout2 = new FrameLayout(context);
                this.fragmentView = frameLayout2;
                org.telegram.ui.Components.tk0 tk0Var3 = new org.telegram.ui.Components.tk0(context, null);
                this.b = tk0Var3;
                tk0Var3.setSectionsDrawBackground(true);
                this.b.r1();
                this.b.setLayoutManager(new s4.a0());
                this.b.setVerticalScrollBarEnabled(false);
                org.telegram.ui.Components.tk0 tk0Var4 = this.b;
                fg.j jVar2 = new fg.j(i11, this, context);
                this.c = jVar2;
                tk0Var4.setAdapter(jVar2);
                this.b.setOnItemClickListener(new g(this, i10));
                frameLayout2.addView(this.b, w7.b6.c(-1.0f, -1));
                break;
        }
        return this.fragmentView;
    }

    public void f0(int i10, CharSequence[] charSequenceArr, org.telegram.ui.Components.z11 z11Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.a.R = org.telegram.messenger.cd.L0(i10, null);
        alertDialog$Builder.f(charSequenceArr, new eg.j(12, this, z11Var));
        showDialog(alertDialog$Builder.a);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final org.telegram.ui.Components.tk0 getListViewForSimpleGlass() {
        switch (this.a) {
        }
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean useSimpleActionBar() {
        switch (this.a) {
        }
        return true;
    }
}
