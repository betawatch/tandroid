package bh;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import i7.f6;
import i7.h6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.u10;
import org.telegram.ui.ig;
import org.telegram.ui.tn;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class f extends FrameLayout implements ViewTreeObserver.OnPreDrawListener {
    public final Rect A;
    public ViewTreeObserver B;
    public int C;
    public final vd.a D;
    public final vd.a E;
    public final b a;
    public final e b;
    public final g c;
    public final tn d;
    public final FrameLayout.LayoutParams e;
    public final h5 f;
    public h h;
    public s1 n;
    public int r;
    public ig s;
    public final d v;
    public final d w;
    public final int x;
    public final int[] y;

    public f(Activity activity, c6 c6Var, tn tnVar) {
        super(activity);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, -2);
        this.e = layoutParams;
        this.y = new int[2];
        this.A = new Rect();
        int i10 = 12;
        a1.c cVar = new a1.c(this, i10);
        jr jrVar = jr.h;
        this.D = new vd.a(0, cVar, jrVar, 380L, false);
        this.E = new vd.a(0, new a1.c(this, i10), jrVar, 380L, false);
        this.d = tnVar;
        this.x = tnVar.getMessagesController().config.pollAnswerLengthMax.get();
        b bVar = new b(this, activity, c6Var, 0);
        this.a = bVar;
        bVar.setAllowTextEntitiesIntersection(true);
        bVar.setTextColor(g6.v0(g6.G6, c6Var));
        bVar.setLinkTextColor(g6.v0(g6.gc, c6Var));
        bVar.setHintTextColor(g6.v0(g6.H6, c6Var));
        bVar.setHint(LocaleController.getString(R.string.PollAddAnOptionHint));
        bVar.setTextSize(1, 15.0f);
        bVar.setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
        bVar.setBackground(null);
        bVar.setImeOptions(268435462);
        bVar.setInputType(bVar.getInputType() | 16384);
        bVar.addTextChangedListener(new c(this, 0));
        e eVar = new e(activity);
        this.b = eVar;
        int i11 = g6.Vh;
        eVar.setBackground(g6.f0(g6.v0(i11, c6Var), 1, -1));
        h6.a(eVar);
        g gVar = new g(getContext(), 36);
        this.c = gVar;
        gVar.setBackground(g6.f0(g6.v0(i11, c6Var), 1, -1));
        gVar.setOnClickListener(new ag.n(2, this, tnVar));
        h6.a(gVar);
        h5 h5Var = new h5(getContext());
        this.f = h5Var;
        h5Var.setTextSize(13);
        h5Var.setGravity(17);
        h5Var.setTranslationY(AndroidUtilities.dp(44.0f));
        h5Var.setVisibility(8);
        d dVar = new d(activity, 1);
        this.w = dVar;
        addView(dVar, layoutParams);
        d dVar2 = new d(activity, 0);
        this.v = dVar2;
        dVar.addView(dVar2, f6.c(-2.0f, -1));
        dVar2.addView(h5Var, f6.e(54, 24, 53));
        dVar2.addView(eVar, f6.e(44, 44, 51));
        dVar2.addView(gVar, f6.d(44, 44.0f, 53, 0.0f, 0.0f, 5.0f, 0.0f));
        dVar2.addView(bVar, f6.d(-1, -2.0f, 119, 39.0f, 0.0f, 47.0f, 0.0f));
        bVar.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f));
    }

    public static void a(f fVar) {
        h5 h5Var = fVar.f;
        u10.d(h5Var, fVar.D.e);
        int i10 = g6.A6;
        tn tnVar = fVar.d;
        h5Var.setTextColor(i0.a.d(fVar.E.e, g6.v0(i10, tnVar.getResourceProvider()), g6.v0(g6.p7, tnVar.getResourceProvider())));
    }

    public h getAttachedMedia() {
        return this.h;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        this.B = viewTreeObserver;
        viewTreeObserver.addOnPreDrawListener(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ViewTreeObserver viewTreeObserver = this.B;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            this.B.removeOnPreDrawListener(this);
        }
        this.B = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        s1 s1Var;
        dh.a aVar;
        s1 s1Var2 = this.n;
        if (s1Var2 != null) {
            int id2 = s1Var2.getMessageObject().getId();
            if (this.n.isAttachedToWindow() && this.r == id2 && (aVar = (s1Var = this.n).W5) != null && s1Var.j6) {
                Rect bounds = aVar.getBounds();
                Rect rect = this.A;
                rect.set(bounds);
                s1 s1Var3 = this.n;
                int[] iArr = this.y;
                s1Var3.getLocationInWindow(iArr);
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
            ig igVar = this.s;
            if (igVar != null) {
                igVar.run();
                this.s = null;
            }
        }
        return true;
    }

    public void setAnimatedVisibility(float f9) {
        this.v.setAlpha(f9);
    }

    public void setCellToWatch(s1 s1Var) {
        this.n = s1Var;
        this.r = s1Var.getMessageObject().getId();
    }

    public void setColor(int i10) {
        if (this.C != i10) {
            this.C = i10;
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
