package gh;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import cg.h0;
import dg.r1;
import dg.s1;
import eg.f2;
import eg.s0;
import f2.l;
import gg.z1;
import j$.util.Map;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import k7.b6;
import k7.d6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.k;
import org.telegram.ui.Cells.t3;
import org.telegram.ui.Components.a20;
import org.telegram.ui.Components.d20;
import org.telegram.ui.Components.h20;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.o30;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.w51;
import r0.b0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class f extends sa implements xd.b {
    public static final /* synthetic */ int o0 = 0;
    public final xd.c U;
    public final xd.a V;
    public final HashMap W;
    public final ArrayList X;
    public final ArrayList Y;
    public String Z;
    public w51 a0;
    public final ph.d b0;
    public final s0 c0;
    public final s1 d0;
    public final h20 e0;
    public final t3 f0;
    public final HashMap g0;
    public o3.c h0;
    public int i0;
    public final int j0;
    public final FrameLayout k0;
    public HashSet l0;
    public final Rect m0;
    public o30 n0;

    public f(Context context, f6 f6Var) {
        super(context, null, true, true, false, false, false, 2, f6Var);
        mr mrVar = mr.h;
        this.U = new xd.c(3, this, mrVar, 350L);
        this.V = new xd.a(4, this, mrVar, 320L, false);
        this.W = new HashMap();
        this.X = new ArrayList();
        this.Y = new ArrayList();
        this.g0 = new HashMap();
        this.m0 = new Rect();
        this.occupyNavigationBar = true;
        this.drawNavigationBar = false;
        this.I = false;
        this.w = false;
        this.j0 = MessagesController.getInstance(this.currentAccount).config.pollCountriesMax.get();
        AndroidUtilities.enableEdgeToEdge(getWindow());
        rl0 rl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        rl0Var.setPadding(i10, 0, i10, AndroidUtilities.dp(68.0f) + AndroidUtilities.navigationBarHeight);
        this.d.setClipToPadding(false);
        this.d.j(new f2(this, 2));
        this.d.setOnItemClickListener(new c(context, this, f6Var));
        ph.d dVar = new ph.d(context, f6Var, true);
        this.b0 = dVar;
        dVar.e();
        dVar.setCountFilled(true);
        dVar.setText(LocaleController.getString(R.string.Save));
        dVar.setOnClickListener(new a(this, 0));
        s0 s0Var = new s0(this, context);
        this.c0 = s0Var;
        s0Var.setTextColor(getThemedColor(j6.Sh));
        s0Var.setText(LocaleController.getString(R.string.Save));
        s0Var.setTypeface(AndroidUtilities.bold());
        s0Var.setTextSize(1, 14.0f);
        s0Var.setGravity(17);
        s0Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        s0Var.setVisibility(8);
        d6.a(s0Var);
        this.e.n().addView(s0Var, b6.t(-2, 48, 16, 12, 0, 12, 0));
        s0Var.setOnClickListener(new a(this, 1));
        d20 d20Var = new d20(context, f6Var);
        String string = LocaleController.getString(R.string.PollV2SearchHint);
        kg.f fVar = d20Var.r;
        fVar.setHint(string);
        fVar.addTextChangedListener(new dh.c(this, 1));
        h20 h20Var = new h20(context, this.currentAccount);
        this.e0 = h20Var;
        h20Var.setDelegate(new b(this));
        s1 s1Var = new s1(context, this, f6Var);
        this.d0 = s1Var;
        int i11 = this.backgroundPaddingLeft;
        s1Var.setPadding(i11, 0, i11, 0);
        s1Var.addView(d20Var, b6.d(-1, 40.0f, 48, 10.0f, 0.0f, 10.0f, 0.0f));
        s1Var.addView(h20Var, b6.d(-1, 144.0f, 48, -3.0f, 40.0f, -3.0f, 0.0f));
        t3 t3Var = new t3(context, 18, f6Var);
        this.f0 = t3Var;
        t3Var.setTranslationY(AndroidUtilities.dp(48.0f));
        t3Var.c(LocaleController.getString(R.string.SearchCountriesTitle), LocaleController.getString(R.string.DeselectAll), new a(this, 2));
        s1Var.addView(t3Var, b6.e(-1, 32, 48));
        this.containerView.addView(s1Var, b6.e(-1, 216, 48));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(AndroidUtilities.dp(10.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(10.0f) + AndroidUtilities.navigationBarHeight);
        frameLayout.addView(dVar, b6.c(48.0f, -1));
        this.containerView.addView(frameLayout, b6.e(-1, -2, 80));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.k0 = frameLayout2;
        frameLayout2.setTranslationY((-AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(68.0f));
        this.containerView.addView(frameLayout2, b6.e(-1, ImageReceiver.DEFAULT_CROSSFADE_DURATION, 80));
        l lVar = new l();
        lVar.n(350L);
        lVar.o(mrVar);
        lVar.C = false;
        lVar.m = false;
        this.d.setItemAnimator(lVar);
        this.d.i(new d(this, f6Var));
        h0 h0Var = new h0(this, 9);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
        TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
        tL_help_getCountriesList.lang_code = LocaleController.getInstance().getCurrentLocaleInfo() != null ? LocaleController.getInstance().getCurrentLocaleInfo().getLangCode() : Locale.getDefault().getCountry();
        connectionsManager.sendRequest(tL_help_getCountriesList, new ff.a(h0Var, 3));
        b0.j(getContainer(), new b(this));
    }

    public static void P(f fVar, Pair pair) {
        HashMap hashMap = fVar.g0;
        HashMap hashMap2 = fVar.W;
        hashMap2.putAll((Map) pair.first);
        ArrayList arrayList = fVar.X;
        arrayList.addAll((Collection) pair.second);
        Map.-EL.forEach(hashMap2, new z1(fVar, 1));
        HashSet hashSet = fVar.l0;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        r7 = null;
                        break;
                    }
                    Object obj = arrayList.get(i10);
                    i10++;
                    for (TLRPC.TL_help_country tL_help_country : (List) hashMap2.get((String) obj)) {
                        if (TextUtils.equals(str, tL_help_country.iso2)) {
                            break;
                        }
                    }
                }
                if (tL_help_country != null) {
                    o30 o30Var = new o30(fVar.getContext(), tL_help_country);
                    o30Var.setOnClickListener(new a(fVar, 3));
                    fVar.e0.a(o30Var);
                    hashMap.put(tL_help_country.iso2, o30Var);
                }
            }
        }
        fVar.a0.N(true);
        fVar.b0.c(hashMap.size(), true);
    }

    @Override // xd.b
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        if (i10 != 3) {
            if (i10 == 4) {
                a20.d(this.c0, f10);
            }
        } else {
            Q();
            this.f0.setTranslationY(AndroidUtilities.dp(48.0f) + f10);
            this.d0.invalidate();
        }
    }

    public final void Q() {
        int dp = AndroidUtilities.dp(56.0f) + k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + ((int) this.U.e);
        int measuredHeight = (this.containerView.getMeasuredHeight() - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(34.0f);
        Rect rect = this.m0;
        boolean z4 = (rect.top == dp && rect.bottom == measuredHeight) ? false : true;
        rect.set(0, dp, this.containerView.getMeasuredWidth(), measuredHeight);
        rl0 rl0Var = this.d;
        rl0Var.setClipBounds(rect);
        if (z4) {
            rl0Var.invalidate();
        }
    }

    public final void R() {
        rl0 rl0Var;
        float f10 = AndroidUtilities.displaySize.y;
        int i10 = 0;
        while (true) {
            rl0Var = this.d;
            if (i10 >= rl0Var.getChildCount()) {
                break;
            }
            View childAt = rl0Var.getChildAt(i10);
            if (RecyclerView.R(childAt) >= 1 && childAt.getY() < f10) {
                f10 = childAt.getY();
            }
            i10++;
        }
        float max = Math.max(k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight, f10 + AndroidUtilities.dp(8.0f));
        s1 s1Var = this.d0;
        if (s1Var.getTranslationY() != max) {
            s1Var.setTranslationY(max);
            rl0Var.invalidate();
        }
    }

    public final void S(View view) {
        o30 o30Var = (o30) view;
        if (!o30Var.y) {
            o30 o30Var2 = this.n0;
            if (o30Var2 != null) {
                o30Var2.a();
            }
            this.n0 = o30Var;
            o30Var.b();
            return;
        }
        this.n0 = null;
        this.e0.c(o30Var);
        String countryIso2 = o30Var.getCountryIso2();
        HashMap hashMap = this.g0;
        hashMap.remove(countryIso2);
        this.b0.c(hashMap.size(), true);
        this.a0.N(true);
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final void onContainerLayout(int i10, int i11, int i12, int i13) {
        super.onContainerLayout(i10, i11, i12, i13);
        Q();
        R();
    }

    @Override // org.telegram.ui.Components.sa
    public final ql0 v(rl0 rl0Var) {
        w51 w51Var = new w51(rl0Var, getContext(), this.currentAccount, 0, true, new r1(this, 1), this.resourcesProvider);
        this.a0 = w51Var;
        w51Var.r = false;
        return w51Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence y() {
        return LocaleController.getString(R.string.BoostingSelectCountry);
    }

    @Override // xd.b
    public final /* synthetic */ void z(float f10, int i10) {
    }
}
