package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Locale;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class bz0 extends org.telegram.ui.ActionBar.f2 {
    public static final int[] d = {750000, 1000000, 1200000, 2000000};
    public final /* synthetic */ int a;
    public org.telegram.ui.Components.pj0 b;
    public org.telegram.ui.Components.oj0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bz0(int i7, Bundle bundle) {
        super(bundle);
        this.a = i7;
    }

    public static void Z(bz0 bz0Var, int i7) {
        if (i7 != 1) {
            if (MediaController.s0(bz0Var.currentAccount) && i7 == 2) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bz0Var.getParentActivity());
                alertDialog$Builder.a.R = org.telegram.messenger.id.M0(2131753922, null);
                alertDialog$Builder.f(new CharSequence[]{org.telegram.messenger.id.M0(2131753921, null), org.telegram.messenger.id.M0(2131753920, null)}, new k4(bz0Var, 0));
                bz0Var.showDialog(alertDialog$Builder.a);
                return;
            }
            return;
        }
        xi.a aVar = xi.e.b;
        boolean z9 = !MediaController.s0(bz0Var.currentAccount);
        synchronized (aVar) {
            aVar.d = z9;
            aVar.c = true;
            aVar.b = true;
            xi.d.a.edit().putBoolean("audio_recorder_v2_enabled", z9).apply();
        }
        ((l4) bz0Var.c).f();
    }

    public static void a0(bz0 bz0Var, int i7) {
        if (i7 == 1) {
            xi.a aVar = xi.e.d;
            boolean z9 = !org.telegram.ui.Components.t40.e(bz0Var.currentAccount);
            synchronized (aVar) {
                aVar.d = z9;
                aVar.c = true;
                aVar.b = true;
                xi.d.a.edit().putBoolean("round_video_camera2_enabled", z9).apply();
            }
            ((l4) bz0Var.c).f();
            return;
        }
        if (!org.telegram.ui.Components.t40.e(bz0Var.currentAccount)) {
            return;
        }
        int i10 = 0;
        if (i7 == 2) {
            bz0Var.g0(2131745986, new CharSequence[]{"480p", "360p"}, new jo0(6));
            return;
        }
        if (i7 == 3) {
            bz0Var.g0(2131745996, new CharSequence[]{org.telegram.messenger.id.M0(2131745995, null), org.telegram.messenger.id.M0(2131745993, null), org.telegram.messenger.id.M0(2131745994, null)}, new jo0(7));
            return;
        }
        int i11 = 8;
        if (i7 == 4) {
            bz0Var.g0(2131745989, new CharSequence[]{"30 FPS", "60 FPS"}, new jo0(i11));
            return;
        }
        if (i7 != 5) {
            if (i7 == 8) {
                xi.a aVar2 = xi.e.i;
                aVar2.a();
                aVar2.b(true ^ aVar2.d);
                ((l4) bz0Var.c).g(i7);
                return;
            }
            return;
        }
        CharSequence[] charSequenceArr = new CharSequence[4];
        while (true) {
            int[] iArr = d;
            if (i10 >= 3) {
                bz0Var.g0(2131745997, charSequenceArr, new jo0(9));
                return;
            } else {
                charSequenceArr[i10] = f0(iArr[i10]);
                i10++;
            }
        }
    }

    public static String f0(int i7) {
        if (i7 % 1000000 == 0) {
            return (i7 / 1000000) + " Mbps";
        }
        if (i7 > 1000000) {
            return String.format(Locale.US, "%.1f Mbps", Float.valueOf(i7 / 1000000.0f));
        }
        return (i7 / 1000) + " kbps";
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        int i7 = 2;
        int i10 = 0;
        switch (this.a) {
            case 0:
                setHasOwnBackground(true);
                this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
                this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131745985, null));
                this.simpleActionBar.setActionBarMenuOnItemClick(new qt0(this, 7));
                FrameLayout frameLayout = new FrameLayout(context);
                this.fragmentView = frameLayout;
                org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
                this.b = pj0Var;
                pj0Var.r1();
                this.b.setSectionsDrawBackground(true);
                this.b.setLayoutManager(new v4.b0());
                this.b.setVerticalScrollBarEnabled(false);
                org.telegram.ui.Components.pj0 pj0Var2 = this.b;
                l4 l4Var = new l4(17, this, context);
                this.c = l4Var;
                pj0Var2.setAdapter(l4Var);
                this.b.setOnItemClickListener(new ay0(this, i7));
                frameLayout.addView(this.b, c8.ha.c(-1.0f, -1));
                break;
            default:
                setHasOwnBackground(true);
                this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
                this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131753919, null));
                this.simpleActionBar.setActionBarMenuOnItemClick(new bi.s(this, 23));
                FrameLayout frameLayout2 = new FrameLayout(context);
                this.fragmentView = frameLayout2;
                org.telegram.ui.Components.pj0 pj0Var3 = new org.telegram.ui.Components.pj0(context, null);
                this.b = pj0Var3;
                pj0Var3.setSectionsDrawBackground(true);
                this.b.r1();
                this.b.setLayoutManager(new v4.b0());
                this.b.setVerticalScrollBarEnabled(false);
                org.telegram.ui.Components.pj0 pj0Var4 = this.b;
                l4 l4Var2 = new l4(i10, this, context);
                this.c = l4Var2;
                pj0Var4.setAdapter(l4Var2);
                this.b.setOnItemClickListener(new h(this, i7));
                frameLayout2.addView(this.b, c8.ha.c(-1.0f, -1));
                break;
        }
        return this.fragmentView;
    }

    public void g0(int i7, CharSequence[] charSequenceArr, jo0 jo0Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.a.R = org.telegram.messenger.id.M0(i7, null);
        alertDialog$Builder.f(charSequenceArr, new og.j(11, this, jo0Var));
        showDialog(alertDialog$Builder.a);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        switch (this.a) {
        }
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSupportEdgeToEdge() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean useSimpleActionBar() {
        switch (this.a) {
        }
        return true;
    }
}
