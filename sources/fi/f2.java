package fi;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.fo0;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.yx0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class f2 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final org.telegram.ui.ActionBar.u6 a;
    public final FrameLayout b;
    public final ImageView c;
    public final fo0 d;
    public final c2 e;
    public final int f;
    public e2 h;
    public boolean n;
    public final ImageView r;
    public boolean s;
    public boolean v;
    public Utilities.Callback2 w;

    public f2(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.f = -1;
        this.a = u6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        int dp = AndroidUtilities.dp(18.0f);
        int i10 = org.telegram.ui.ActionBar.y6.Ie;
        Drawable c02 = org.telegram.ui.ActionBar.y6.c0(dp, org.telegram.ui.ActionBar.y6.w0(i10, u6Var));
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i10);
        frameLayout.setBackground(c02);
        org.telegram.ui.ActionBar.f7.k(frameLayout, c02, N, null, u6Var);
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new ag.v0(4));
        addView(frameLayout, kb1.h(-1, 36.0f, 119, 10.0f, 6.0f, 10.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout.addView(frameLayout2, kb1.h(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        fo0 fo0Var = new fo0();
        this.d = fo0Var;
        fo0Var.c(0, false, false);
        int i11 = org.telegram.ui.ActionBar.y6.Je;
        fo0Var.a(org.telegram.ui.ActionBar.y6.w0(i11, u6Var));
        imageView.setImageDrawable(fo0Var);
        frameLayout.addView(imageView, kb1.i(36, 36, 51));
        c2 c2Var = new c2(this, context, 0);
        this.e = c2Var;
        c2Var.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.f7.E(c2Var, i11, u6Var);
        org.telegram.ui.ActionBar.f7.V(c2Var, org.telegram.ui.ActionBar.y6.G6, u6Var);
        c2Var.setBackgroundDrawable(null);
        c2Var.setPadding(0, 0, 0, 0);
        c2Var.setMaxLines(1);
        c2Var.setLines(1);
        c2Var.setSingleLine(true);
        c2Var.setImeOptions(268435459);
        c2Var.setHint(LocaleController.getString(R.string.Search));
        int i12 = org.telegram.ui.ActionBar.y6.Mh;
        org.telegram.ui.ActionBar.f7.m(c2Var, 30, i12, u6Var);
        org.telegram.ui.ActionBar.f7.m(c2Var, 36, i12, u6Var);
        c2Var.setCursorSize(AndroidUtilities.dp(20.0f));
        c2Var.setCursorWidth(1.5f);
        c2Var.setTranslationY(AndroidUtilities.dp(-2.0f));
        frameLayout2.addView(c2Var, kb1.h(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
        c2Var.addTextChangedListener(new bi.u(this, 1));
        ImageView imageView2 = new ImageView(context);
        this.r = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new d2(u6Var));
        int i13 = org.telegram.ui.ActionBar.y6.i6;
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.w0(i13, u6Var), 1, AndroidUtilities.dp(15.0f));
        org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i13);
        imageView2.setBackground(g02);
        org.telegram.ui.ActionBar.f7.k(imageView2, g02, null, N2, u6Var);
        imageView2.setAlpha(0.0f);
        imageView2.setScaleX(0.7f);
        imageView2.setScaleY(0.7f);
        imageView2.setVisibility(8);
        final int i14 = 0;
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: fi.a2
            public final /* synthetic */ f2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        this.b.b();
                        break;
                    default:
                        f2 f2Var = this.b;
                        int i15 = f2Var.d.k;
                        if (i15 != 1) {
                            if (i15 == 0) {
                                f2Var.e.requestFocus();
                                break;
                            }
                        } else {
                            f2Var.b();
                            e2 e2Var = f2Var.h;
                            if (e2Var != null) {
                                e2Var.J1();
                                break;
                            }
                        }
                        break;
                }
            }
        });
        frameLayout.addView(imageView2, kb1.i(36, 36, 53));
        final int i15 = 1;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: fi.a2
            public final /* synthetic */ f2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        this.b.b();
                        break;
                    default:
                        f2 f2Var = this.b;
                        int i152 = f2Var.d.k;
                        if (i152 != 1) {
                            if (i152 == 0) {
                                f2Var.e.requestFocus();
                                break;
                            }
                        } else {
                            f2Var.b();
                            e2 e2Var = f2Var.h;
                            if (e2Var != null) {
                                e2Var.J1();
                                break;
                            }
                        }
                        break;
                }
            }
        });
    }

    public final void a(int i10, boolean z10) {
        if (this.f != i10 || this.h == null) {
            e2 e2Var = this.h;
            FrameLayout frameLayout = this.b;
            if (e2Var != null) {
                frameLayout.removeView(e2Var);
            }
            e2 e2Var2 = new e2(this, getContext(), i10 == 1 ? 3 : 0, this.a, z10);
            this.h = e2Var2;
            c2 c2Var = this.e;
            e2Var2.setDontOccupyWidth(AndroidUtilities.dp(16.0f) + ((int) c2Var.getPaint().measureText(((Object) c2Var.getHint()) + "")));
            final int i11 = 0;
            this.h.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) { // from class: fi.b2
                public final /* synthetic */ f2 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i11) {
                        case 0:
                            f2 f2Var = this.b;
                            c2 c2Var2 = f2Var.e;
                            c2Var2.animate().cancel();
                            c2Var2.setTranslationX(-Math.max(0, ((Integer) obj).intValue()));
                            f2Var.d(false);
                            break;
                        default:
                            yx0 yx0Var = (yx0) obj;
                            f2 f2Var2 = this.b;
                            e2 e2Var3 = f2Var2.h;
                            if (e2Var3 != null) {
                                if (e2Var3.getSelectedCategory() != yx0Var) {
                                    f2Var2.h.L1(yx0Var);
                                    String str = yx0Var.a;
                                    int categoryIndex = f2Var2.h.getCategoryIndex();
                                    Utilities.Callback2 callback2 = f2Var2.w;
                                    if (callback2 != null) {
                                        callback2.run(str, Integer.valueOf(categoryIndex));
                                        break;
                                    }
                                } else {
                                    f2Var2.h.L1(null);
                                    Utilities.Callback2 callback22 = f2Var2.w;
                                    if (callback22 != null) {
                                        callback22.run(null, -1);
                                        break;
                                    }
                                }
                            }
                            break;
                    }
                }
            });
            final int i12 = 1;
            this.h.setOnCategoryClick(new Utilities.Callback(this) { // from class: fi.b2
                public final /* synthetic */ f2 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i12) {
                        case 0:
                            f2 f2Var = this.b;
                            c2 c2Var2 = f2Var.e;
                            c2Var2.animate().cancel();
                            c2Var2.setTranslationX(-Math.max(0, ((Integer) obj).intValue()));
                            f2Var.d(false);
                            break;
                        default:
                            yx0 yx0Var = (yx0) obj;
                            f2 f2Var2 = this.b;
                            e2 e2Var3 = f2Var2.h;
                            if (e2Var3 != null) {
                                if (e2Var3.getSelectedCategory() != yx0Var) {
                                    f2Var2.h.L1(yx0Var);
                                    String str = yx0Var.a;
                                    int categoryIndex = f2Var2.h.getCategoryIndex();
                                    Utilities.Callback2 callback2 = f2Var2.w;
                                    if (callback2 != null) {
                                        callback2.run(str, Integer.valueOf(categoryIndex));
                                        break;
                                    }
                                } else {
                                    f2Var2.h.L1(null);
                                    Utilities.Callback2 callback22 = f2Var2.w;
                                    if (callback22 != null) {
                                        callback22.run(null, -1);
                                        break;
                                    }
                                }
                            }
                            break;
                    }
                }
            });
            frameLayout.addView(this.h, Math.max(0, frameLayout.getChildCount() - 1), kb1.h(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
        }
    }

    public final void b() {
        this.e.setText("");
        Utilities.Callback2 callback2 = this.w;
        if (callback2 != null) {
            callback2.run(null, -1);
        }
        e2 e2Var = this.h;
        if (e2Var != null) {
            e2Var.L1(null);
        }
    }

    public final void c(boolean z10) {
        this.v = z10;
        if (z10) {
            this.d.b(2);
        } else {
            d(true);
        }
    }

    public final void d(boolean z10) {
        e2 e2Var;
        e2 e2Var2;
        boolean z11 = this.v;
        c2 c2Var = this.e;
        if (!z11 || ((c2Var.length() == 0 && ((e2Var2 = this.h) == null || e2Var2.getSelectedCategory() == null)) || z10)) {
            this.d.b((c2Var.length() > 0 || ((e2Var = this.h) != null && e2Var.w3 > 0.5f && ((e2Var != null && e2Var.r3) || e2Var.getSelectedCategory() != null))) ? 1 : 0);
            this.v = false;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        try {
            fo0 fo0Var = this.d;
            org.telegram.ui.ActionBar.u6 u6Var = this.a;
            if (fo0Var != null) {
                fo0Var.a(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Je, u6Var));
            }
            ImageView imageView = this.c;
            if (imageView != null) {
                imageView.invalidate();
            }
            c2 c2Var = this.e;
            if (c2Var != null) {
                int i10 = org.telegram.ui.ActionBar.y6.Mh;
                c2Var.setCursorColor(org.telegram.ui.ActionBar.y6.w0(i10, u6Var));
                c2Var.setHandlesColor(org.telegram.ui.ActionBar.y6.w0(i10, u6Var));
            }
            ImageView imageView2 = this.r;
            if (imageView2 != null) {
                imageView2.invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
