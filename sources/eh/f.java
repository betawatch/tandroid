package eh;

import ag.i0;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import bg.t1;
import bg.u1;
import cg.g2;
import cg.s0;
import eg.a2;
import f2.l;
import i7.f6;
import i7.h6;
import j$.util.Map;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import nh.d6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.s3;
import org.telegram.ui.Components.b20;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.j30;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.u10;
import org.telegram.ui.Components.x10;
import org.telegram.ui.Components.xa;
import r0.b0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class f extends xa implements vd.b {
    public static final /* synthetic */ int n0 = 0;
    public final vd.c T;
    public final vd.a U;
    public final HashMap V;
    public final ArrayList W;
    public final ArrayList X;
    public String Y;
    public k51 Z;
    public final nh.d a0;
    public final s0 b0;
    public final u1 c0;
    public final b20 d0;
    public final s3 e0;
    public final HashMap f0;
    public d6 g0;
    public int h0;
    public final int i0;
    public final FrameLayout j0;
    public HashSet k0;
    public final Rect l0;
    public j30 m0;

    public f(Context context, c6 c6Var) {
        super(context, null, true, true, false, false, false, 2, c6Var);
        jr jrVar = jr.h;
        this.T = new vd.c(3, this, jrVar, 350L);
        this.U = new vd.a(4, this, jrVar, 320L, false);
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
        jl0 jl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        jl0Var.setPadding(i10, 0, i10, AndroidUtilities.dp(68.0f) + AndroidUtilities.navigationBarHeight);
        this.d.setClipToPadding(false);
        this.d.j(new g2(this, 2));
        this.d.setOnItemClickListener(new c(context, this, c6Var));
        nh.d dVar = new nh.d(context, c6Var, true);
        this.a0 = dVar;
        dVar.e();
        dVar.setCountFilled(true);
        dVar.setText(LocaleController.getString(R.string.Save));
        dVar.setOnClickListener(new a(this, 0));
        s0 s0Var = new s0(this, context);
        this.b0 = s0Var;
        s0Var.setTextColor(getThemedColor(g6.Sh));
        s0Var.setText(LocaleController.getString(R.string.Save));
        s0Var.setTypeface(AndroidUtilities.bold());
        s0Var.setTextSize(1, 14.0f);
        s0Var.setGravity(17);
        s0Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        s0Var.setVisibility(8);
        h6.a(s0Var);
        this.e.n().addView(s0Var, f6.t(-2, 48, 16, 12, 0, 12, 0));
        s0Var.setOnClickListener(new a(this, 1));
        x10 x10Var = new x10(context, c6Var);
        String string = LocaleController.getString(R.string.PollV2SearchHint);
        ig.f fVar = x10Var.r;
        fVar.setHint(string);
        fVar.addTextChangedListener(new bh.c(this, 1));
        b20 b20Var = new b20(context, this.currentAccount);
        this.d0 = b20Var;
        b20Var.setDelegate(new b(this));
        u1 u1Var = new u1(context, this, c6Var);
        this.c0 = u1Var;
        int i11 = this.backgroundPaddingLeft;
        u1Var.setPadding(i11, 0, i11, 0);
        u1Var.addView(x10Var, f6.d(-1, 40.0f, 48, 10.0f, 0.0f, 10.0f, 0.0f));
        u1Var.addView(b20Var, f6.d(-1, 144.0f, 48, -3.0f, 40.0f, -3.0f, 0.0f));
        s3 s3Var = new s3(context, 18, c6Var);
        this.e0 = s3Var;
        s3Var.setTranslationY(AndroidUtilities.dp(48.0f));
        s3Var.c(LocaleController.getString(R.string.SearchCountriesTitle), LocaleController.getString(R.string.DeselectAll), new a(this, 2));
        u1Var.addView(s3Var, f6.e(-1, 32, 48));
        this.containerView.addView(u1Var, f6.e(-1, 216, 48));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(AndroidUtilities.dp(10.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(10.0f) + AndroidUtilities.navigationBarHeight);
        frameLayout.addView(dVar, f6.c(48.0f, -1));
        this.containerView.addView(frameLayout, f6.e(-1, -2, 80));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.j0 = frameLayout2;
        frameLayout2.setTranslationY((-AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(68.0f));
        this.containerView.addView(frameLayout2, f6.e(-1, ImageReceiver.DEFAULT_CROSSFADE_DURATION, 80));
        l lVar = new l();
        lVar.n(350L);
        lVar.o(jrVar);
        lVar.C = false;
        lVar.m = false;
        this.d.setItemAnimator(lVar);
        this.d.i(new d(this, c6Var));
        i0 i0Var = new i0(this, 9);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
        TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
        tL_help_getCountriesList.lang_code = LocaleController.getInstance().getCurrentLocaleInfo() != null ? LocaleController.getInstance().getCurrentLocaleInfo().getLangCode() : Locale.getDefault().getCountry();
        connectionsManager.sendRequest(tL_help_getCountriesList, new ef.a(i0Var, 3));
        b0.j(getContainer(), new b(this));
    }

    public static void P(f fVar, Pair pair) {
        HashMap hashMap = fVar.f0;
        HashMap hashMap2 = fVar.V;
        hashMap2.putAll((Map) pair.first);
        ArrayList arrayList = fVar.W;
        arrayList.addAll((Collection) pair.second);
        Map.-EL.forEach(hashMap2, new a2(fVar, 1));
        HashSet hashSet = fVar.k0;
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
                    j30 j30Var = new j30(fVar.getContext(), tL_help_country);
                    j30Var.setOnClickListener(new a(fVar, 3));
                    fVar.d0.a(j30Var);
                    hashMap.put(tL_help_country.iso2, j30Var);
                }
            }
        }
        fVar.Z.N(true);
        fVar.a0.c(hashMap.size(), true);
    }

    @Override // vd.b
    public final void N(int i10, float f9, float f10, vd.c cVar) {
        if (i10 != 3) {
            if (i10 == 4) {
                u10.d(this.b0, f9);
            }
        } else {
            Q();
            this.e0.setTranslationY(AndroidUtilities.dp(48.0f) + f9);
            this.c0.invalidate();
        }
    }

    public final void Q() {
        int dp = AndroidUtilities.dp(56.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + ((int) this.T.e);
        int measuredHeight = (this.containerView.getMeasuredHeight() - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(34.0f);
        Rect rect = this.l0;
        boolean z10 = (rect.top == dp && rect.bottom == measuredHeight) ? false : true;
        rect.set(0, dp, this.containerView.getMeasuredWidth(), measuredHeight);
        jl0 jl0Var = this.d;
        jl0Var.setClipBounds(rect);
        if (z10) {
            jl0Var.invalidate();
        }
    }

    public final void R() {
        jl0 jl0Var;
        float f9 = AndroidUtilities.displaySize.y;
        int i10 = 0;
        while (true) {
            jl0Var = this.d;
            if (i10 >= jl0Var.getChildCount()) {
                break;
            }
            View childAt = jl0Var.getChildAt(i10);
            if (RecyclerView.R(childAt) >= 1 && childAt.getY() < f9) {
                f9 = childAt.getY();
            }
            i10++;
        }
        float max = Math.max(org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight, f9 + AndroidUtilities.dp(8.0f));
        u1 u1Var = this.c0;
        if (u1Var.getTranslationY() != max) {
            u1Var.setTranslationY(max);
            jl0Var.invalidate();
        }
    }

    public final void S(View view) {
        j30 j30Var = (j30) view;
        if (!j30Var.y) {
            j30 j30Var2 = this.m0;
            if (j30Var2 != null) {
                j30Var2.a();
            }
            this.m0 = j30Var;
            j30Var.b();
            return;
        }
        this.m0 = null;
        this.d0.c(j30Var);
        String countryIso2 = j30Var.getCountryIso2();
        HashMap hashMap = this.f0;
        hashMap.remove(countryIso2);
        this.a0.c(hashMap.size(), true);
        this.Z.N(true);
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onContainerLayout(int i10, int i11, int i12, int i13) {
        super.onContainerLayout(i10, i11, i12, i13);
        Q();
        R();
    }

    @Override // org.telegram.ui.Components.xa
    public final il0 v(jl0 jl0Var) {
        k51 k51Var = new k51(jl0Var, getContext(), this.currentAccount, 0, true, new t1(this, 1), this.resourcesProvider);
        this.Z = k51Var;
        k51Var.r = false;
        return k51Var;
    }

    @Override // org.telegram.ui.Components.xa
    public final CharSequence y() {
        return LocaleController.getString(R.string.BoostingSelectCountry);
    }

    @Override // vd.b
    public final /* synthetic */ void z(float f9, int i10) {
    }
}
