package eh;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import k7.c6;
import k7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.a20;
import org.telegram.ui.Components.pr;
import org.telegram.ui.ng;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class f extends FrameLayout implements ViewTreeObserver.OnPreDrawListener {
    public final Rect B;
    public ViewTreeObserver C;
    public int D;
    public final xd.a E;
    public final xd.a F;
    public final b a;
    public final e b;
    public final g c;
    public final xn d;
    public final FrameLayout.LayoutParams e;
    public final l5 f;
    public h h;
    public t1 n;
    public int r;
    public ng s;
    public final d v;
    public final d w;
    public final int x;
    public final int[] y;

    public f(Activity activity, g6 g6Var, xn xnVar) {
        super(activity);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, -2);
        this.e = layoutParams;
        this.y = new int[2];
        this.B = new Rect();
        int i10 = 25;
        a1.c cVar = new a1.c(this, i10);
        pr prVar = pr.h;
        this.E = new xd.a(0, cVar, prVar, 380L, false);
        this.F = new xd.a(0, new a1.c(this, i10), prVar, 380L, false);
        this.d = xnVar;
        this.x = xnVar.getMessagesController().config.pollAnswerLengthMax.get();
        b bVar = new b(this, activity, g6Var, 0);
        this.a = bVar;
        bVar.setAllowTextEntitiesIntersection(true);
        bVar.setTextColor(k6.v0(k6.G6, g6Var));
        bVar.setLinkTextColor(k6.v0(k6.gc, g6Var));
        bVar.setHintTextColor(k6.v0(k6.H6, g6Var));
        bVar.setHint(LocaleController.getString(R.string.PollAddAnOptionHint));
        bVar.setTextSize(1, 15.0f);
        bVar.setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
        bVar.setBackground(null);
        bVar.setImeOptions(268435462);
        bVar.setInputType(bVar.getInputType() | 16384);
        bVar.addTextChangedListener(new c(this, 0));
        e eVar = new e(activity);
        this.b = eVar;
        int i11 = k6.Vh;
        eVar.setBackground(k6.f0(k6.v0(i11, g6Var), 1, -1));
        e6.a(eVar);
        g gVar = new g(getContext(), 36);
        this.c = gVar;
        gVar.setBackground(k6.f0(k6.v0(i11, g6Var), 1, -1));
        gVar.setOnClickListener(new dg.n(2, this, xnVar));
        e6.a(gVar);
        l5 l5Var = new l5(getContext());
        this.f = l5Var;
        l5Var.setTextSize(13);
        l5Var.setGravity(17);
        l5Var.setTranslationY(AndroidUtilities.dp(44.0f));
        l5Var.setVisibility(8);
        d dVar = new d(activity, 1);
        this.w = dVar;
        addView(dVar, layoutParams);
        d dVar2 = new d(activity, 0);
        this.v = dVar2;
        dVar.addView(dVar2, c6.c(-2.0f, -1));
        dVar2.addView(l5Var, c6.e(54, 24, 53));
        dVar2.addView(eVar, c6.e(44, 44, 51));
        dVar2.addView(gVar, c6.d(44, 44.0f, 53, 0.0f, 0.0f, 5.0f, 0.0f));
        dVar2.addView(bVar, c6.d(-1, -2.0f, 119, 39.0f, 0.0f, 47.0f, 0.0f));
        bVar.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f));
    }

    public static void a(f fVar) {
        l5 l5Var = fVar.f;
        a20.d(l5Var, fVar.E.e);
        int i10 = k6.A6;
        xn xnVar = fVar.d;
        l5Var.setTextColor(i0.a.d(fVar.F.e, k6.v0(i10, xnVar.getResourceProvider()), k6.v0(k6.p7, xnVar.getResourceProvider())));
    }

    public h getAttachedMedia() {
        return this.h;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        this.C = viewTreeObserver;
        viewTreeObserver.addOnPreDrawListener(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ViewTreeObserver viewTreeObserver = this.C;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            this.C.removeOnPreDrawListener(this);
        }
        this.C = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        t1 t1Var;
        gh.a aVar;
        t1 t1Var2 = this.n;
        if (t1Var2 != null) {
            int id2 = t1Var2.getMessageObject().getId();
            if (this.n.isAttachedToWindow() && this.r == id2 && (aVar = (t1Var = this.n).X5) != null && t1Var.k6) {
                Rect bounds = aVar.getBounds();
                Rect rect = this.B;
                rect.set(bounds);
                t1 t1Var3 = this.n;
                int[] iArr = this.y;
                t1Var3.getLocationInWindow(iArr);
                int i10 = iArr[0];
                int i11 = iArr[1];
                getLocationInWindow(iArr);
                rect.offset(i10 - iArr[0], i11 - iArr[1]);
                int width = rect.width();
                FrameLayout.LayoutParams layoutParams = this.e;
                int i12 = layoutParams.width;
                d dVar = this.w;
                if (i12 != width) {
                    layoutParams.width = width;
                    dVar.setLayoutParams(layoutParams);
                }
                dVar.setTranslationX(rect.left);
                dVar.setTranslationY(AndroidUtilities.dp(0.66f) + rect.top);
                return true;
            }
            ng ngVar = this.s;
            if (ngVar != null) {
                ngVar.run();
                this.s = null;
            }
        }
        return true;
    }

    public void setAnimatedVisibility(float f10) {
        this.v.setAlpha(f10);
    }

    public void setCellToWatch(t1 t1Var) {
        this.n = t1Var;
        this.r = t1Var.getMessageObject().getId();
    }

    public void setColor(int i10) {
        if (this.D != i10) {
            this.D = i10;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
            e eVar = this.b;
            eVar.b.setColorFilter(porterDuffColorFilter);
            eVar.c.setColorFilter(porterDuffColorFilter);
            this.c.a.setColorFilter(porterDuffColorFilter);
            b bVar = this.a;
            bVar.setCursorColor(i10);
            bVar.setHandlesColor(i10);
            bVar.setHintTextColor(i10);
        }
    }
}
