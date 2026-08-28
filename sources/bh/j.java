package bh;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import bg.j2;
import bg.o2;
import f2.n;
import g7.e6;
import g7.g6;
import j$.util.Map;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import n5.a0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.v3;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.j10;
import org.telegram.ui.Components.m10;
import org.telegram.ui.Components.q10;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.w20;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;
import r0.b0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class j extends sa implements td.b {
    public static final /* synthetic */ int n0 = 0;
    public final td.c T;
    public final td.a U;
    public final HashMap V;
    public final ArrayList W;
    public final ArrayList X;
    public String Y;
    public z41 Z;
    public final kh.d a0;
    public final e b0;
    public final g c0;
    public final q10 d0;
    public final v3 e0;
    public final HashMap f0;
    public a0 g0;
    public int h0;
    public final int i0;
    public final FrameLayout j0;
    public HashSet k0;
    public final Rect l0;
    public w20 m0;

    public j(Context context, b6 b6Var) {
        super(context, null, true, true, false, false, false, 2, b6Var);
        gr grVar = gr.h;
        this.T = new td.c(3, this, grVar, 350L);
        this.U = new td.a(4, this, grVar, 320L, false);
        this.V = new HashMap();
        this.W = new ArrayList();
        this.X = new ArrayList();
        this.f0 = new HashMap();
        this.l0 = new Rect();
        this.occupyNavigationBar = true;
        this.drawNavigationBar = false;
        this.H = false;
        this.w = false;
        this.i0 = MessagesController.getInstance(this.currentAccount).config.pollCountriesMax.get();
        AndroidUtilities.enableEdgeToEdge(getWindow());
        wk0 wk0Var = this.d;
        int i9 = this.backgroundPaddingLeft;
        wk0Var.setPadding(i9, 0, i9, AndroidUtilities.dp(68.0f) + AndroidUtilities.navigationBarHeight);
        this.d.setClipToPadding(false);
        this.d.j(new o2(this, 1));
        this.d.setOnItemClickListener(new d(context, this, b6Var));
        kh.d dVar = new kh.d(context, b6Var, true);
        this.a0 = dVar;
        dVar.e();
        dVar.setCountFilled(true);
        dVar.setText(LocaleController.getString(R.string.Save));
        dVar.setOnClickListener(new a(this, 0));
        e eVar = new e(this, context);
        this.b0 = eVar;
        eVar.setTextColor(getThemedColor(f6.Sh));
        eVar.setText(LocaleController.getString(R.string.Save));
        eVar.setTypeface(AndroidUtilities.bold());
        eVar.setTextSize(1, 14.0f);
        eVar.setGravity(17);
        eVar.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        eVar.setVisibility(8);
        g6.a(eVar);
        this.e.n().addView(eVar, e6.t(-2, 48, 16, 12, 0, 12, 0));
        eVar.setOnClickListener(new a(this, 1));
        m10 m10Var = new m10(context, b6Var);
        String string = LocaleController.getString(R.string.PollV2SearchHint);
        fg.g gVar = m10Var.r;
        gVar.setHint(string);
        gVar.addTextChangedListener(new f(this, 0));
        q10 q10Var = new q10(context, this.currentAccount);
        this.d0 = q10Var;
        q10Var.setDelegate(new b(this));
        g gVar2 = new g(context, this, b6Var);
        this.c0 = gVar2;
        int i10 = this.backgroundPaddingLeft;
        gVar2.setPadding(i10, 0, i10, 0);
        gVar2.addView(m10Var, e6.d(-1, 40.0f, 48, 10.0f, 0.0f, 10.0f, 0.0f));
        gVar2.addView(q10Var, e6.d(-1, 144.0f, 48, -3.0f, 40.0f, -3.0f, 0.0f));
        v3 v3Var = new v3(context, 18, b6Var);
        this.e0 = v3Var;
        v3Var.setTranslationY(AndroidUtilities.dp(48.0f));
        v3Var.c(LocaleController.getString(R.string.SearchCountriesTitle), LocaleController.getString(R.string.DeselectAll), new a(this, 2));
        gVar2.addView(v3Var, e6.e(-1, 32, 48));
        this.containerView.addView(gVar2, e6.e(-1, 216, 48));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(AndroidUtilities.dp(10.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(10.0f) + AndroidUtilities.navigationBarHeight);
        frameLayout.addView(dVar, e6.c(48.0f, -1));
        this.containerView.addView(frameLayout, e6.e(-1, -2, 80));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.j0 = frameLayout2;
        frameLayout2.setTranslationY((-AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(68.0f));
        this.containerView.addView(frameLayout2, e6.e(-1, ImageReceiver.DEFAULT_CROSSFADE_DURATION, 80));
        n nVar = new n();
        nVar.n(350L);
        nVar.o(grVar);
        nVar.C = false;
        nVar.m = false;
        this.d.setItemAnimator(nVar);
        this.d.i(new h(this, b6Var));
        bg.i iVar = new bg.i(this, 2);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
        TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
        tL_help_getCountriesList.lang_code = LocaleController.getInstance().getCurrentLocaleInfo() != null ? LocaleController.getInstance().getCurrentLocaleInfo().getLangCode() : Locale.getDefault().getCountry();
        connectionsManager.sendRequest(tL_help_getCountriesList, new bf.a(iVar, 3));
        b0.j(getContainer(), new b(this));
    }

    public static void O(j jVar, Pair pair) {
        HashMap hashMap = jVar.f0;
        HashMap hashMap2 = jVar.V;
        hashMap2.putAll((Map) pair.first);
        ArrayList arrayList = jVar.W;
        arrayList.addAll((Collection) pair.second);
        Map.-EL.forEach(hashMap2, new j2(jVar, 1));
        HashSet hashSet = jVar.k0;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                int size = arrayList.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size) {
                        r7 = null;
                        break;
                    }
                    Object obj = arrayList.get(i9);
                    i9++;
                    for (TLRPC.TL_help_country tL_help_country : (List) hashMap2.get((String) obj)) {
                        if (TextUtils.equals(str, tL_help_country.iso2)) {
                            break;
                        }
                    }
                }
                if (tL_help_country != null) {
                    w20 w20Var = new w20(jVar.getContext(), tL_help_country);
                    w20Var.setOnClickListener(new a(jVar, 3));
                    jVar.d0.a(w20Var);
                    hashMap.put(tL_help_country.iso2, w20Var);
                }
            }
        }
        jVar.Z.N(true);
        jVar.a0.c(hashMap.size(), true);
    }

    @Override // td.b
    public final void J0(int i9, float f10, float f11, td.c cVar) {
        if (i9 != 3) {
            if (i9 == 4) {
                j10.d(this.b0, f10);
            }
        } else {
            P();
            this.e0.setTranslationY(AndroidUtilities.dp(48.0f) + f10);
            this.c0.invalidate();
        }
    }

    public final void P() {
        int dp = AndroidUtilities.dp(56.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + ((int) this.T.e);
        int measuredHeight = (this.containerView.getMeasuredHeight() - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(34.0f);
        Rect rect = this.l0;
        boolean z10 = (rect.top == dp && rect.bottom == measuredHeight) ? false : true;
        rect.set(0, dp, this.containerView.getMeasuredWidth(), measuredHeight);
        wk0 wk0Var = this.d;
        wk0Var.setClipBounds(rect);
        if (z10) {
            wk0Var.invalidate();
        }
    }

    public final void Q() {
        wk0 wk0Var;
        float f10 = AndroidUtilities.displaySize.y;
        int i9 = 0;
        while (true) {
            wk0Var = this.d;
            if (i9 >= wk0Var.getChildCount()) {
                break;
            }
            View childAt = wk0Var.getChildAt(i9);
            if (RecyclerView.R(childAt) >= 1 && childAt.getY() < f10) {
                f10 = childAt.getY();
            }
            i9++;
        }
        float max = Math.max(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight, f10 + AndroidUtilities.dp(8.0f));
        g gVar = this.c0;
        if (gVar.getTranslationY() != max) {
            gVar.setTranslationY(max);
            wk0Var.invalidate();
        }
    }

    public final void R(View view) {
        w20 w20Var = (w20) view;
        if (!w20Var.y) {
            w20 w20Var2 = this.m0;
            if (w20Var2 != null) {
                w20Var2.a();
            }
            this.m0 = w20Var;
            w20Var.b();
            return;
        }
        this.m0 = null;
        this.d0.c(w20Var);
        String countryIso2 = w20Var.getCountryIso2();
        HashMap hashMap = this.f0;
        hashMap.remove(countryIso2);
        this.a0.c(hashMap.size(), true);
        this.Z.N(true);
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onContainerLayout(int i9, int i10, int i11, int i12) {
        super.onContainerLayout(i9, i10, i11, i12);
        P();
        Q();
    }

    @Override // org.telegram.ui.Components.sa
    public final vk0 v(wk0 wk0Var) {
        z41 z41Var = new z41(wk0Var, getContext(), this.currentAccount, 0, true, new c(this, 0), this.resourcesProvider);
        this.Z = z41Var;
        z41Var.r = false;
        return z41Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence y() {
        return LocaleController.getString(R.string.BoostingSelectCountry);
    }

    @Override // td.b
    public final /* synthetic */ void B(float f10, int i9) {
    }
}
