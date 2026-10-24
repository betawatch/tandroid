package ei;

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
import org.telegram.ui.Components.qx0;
import org.telegram.ui.Components.zn0;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class h2 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.g6 a;
    public final FrameLayout b;
    public final ImageView c;
    public final zn0 d;
    public final e2 e;
    public final int f;
    public g2 h;
    public boolean n;
    public final ImageView r;
    public boolean s;
    public boolean v;
    public Utilities.Callback2 w;

    public h2(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f = -1;
        this.a = g6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        int dp = AndroidUtilities.dp(18.0f);
        int i10 = org.telegram.ui.ActionBar.k6.Ie;
        Drawable c02 = org.telegram.ui.ActionBar.k6.c0(dp, org.telegram.ui.ActionBar.k6.w0(i10, g6Var));
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i10);
        frameLayout.setBackground(c02);
        org.telegram.ui.ActionBar.r6.k(frameLayout, c02, O, null, g6Var);
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new ci.n1(2));
        addView(frameLayout, w7.z5.d(-1, 36.0f, 119, 10.0f, 6.0f, 10.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout.addView(frameLayout2, w7.z5.d(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        zn0 zn0Var = new zn0();
        this.d = zn0Var;
        zn0Var.c(0, false, false);
        int i11 = org.telegram.ui.ActionBar.k6.Je;
        zn0Var.a(org.telegram.ui.ActionBar.k6.w0(i11, g6Var));
        imageView.setImageDrawable(zn0Var);
        frameLayout.addView(imageView, w7.z5.e(36, 36, 51));
        e2 e2Var = new e2(this, context, 0);
        this.e = e2Var;
        e2Var.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.r6.F(e2Var, i11, g6Var);
        org.telegram.ui.ActionBar.r6.W(e2Var, org.telegram.ui.ActionBar.k6.G6, g6Var);
        e2Var.setBackgroundDrawable(null);
        e2Var.setPadding(0, 0, 0, 0);
        e2Var.setMaxLines(1);
        e2Var.setLines(1);
        e2Var.setSingleLine(true);
        e2Var.setImeOptions(268435459);
        e2Var.setHint(LocaleController.getString(R.string.Search));
        int i12 = org.telegram.ui.ActionBar.k6.Mh;
        org.telegram.ui.ActionBar.r6.m(e2Var, 30, i12, g6Var);
        org.telegram.ui.ActionBar.r6.m(e2Var, 36, i12, g6Var);
        e2Var.setCursorSize(AndroidUtilities.dp(20.0f));
        e2Var.setCursorWidth(1.5f);
        e2Var.setTranslationY(AndroidUtilities.dp(-2.0f));
        frameLayout2.addView(e2Var, w7.z5.d(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
        e2Var.addTextChangedListener(new ai.u(this, 1));
        ImageView imageView2 = new ImageView(context);
        this.r = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new f2(g6Var));
        int i13 = org.telegram.ui.ActionBar.k6.i6;
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.w0(i13, g6Var), 1, AndroidUtilities.dp(15.0f));
        org.telegram.ui.ActionBar.n6 O2 = org.telegram.ui.ActionBar.r6.O(i13);
        imageView2.setBackground(g02);
        org.telegram.ui.ActionBar.r6.k(imageView2, g02, null, O2, g6Var);
        imageView2.setAlpha(0.0f);
        imageView2.setScaleX(0.7f);
        imageView2.setScaleY(0.7f);
        imageView2.setVisibility(8);
        final int i14 = 0;
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: ei.c2
            public final /* synthetic */ h2 b;

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
                        h2 h2Var = this.b;
                        int i15 = h2Var.d.k;
                        if (i15 != 1) {
                            if (i15 == 0) {
                                h2Var.e.requestFocus();
                                break;
                            }
                        } else {
                            h2Var.b();
                            g2 g2Var = h2Var.h;
                            if (g2Var != null) {
                                g2Var.J1();
                                break;
                            }
                        }
                        break;
                }
            }
        });
        frameLayout.addView(imageView2, w7.z5.e(36, 36, 53));
        final int i15 = 1;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: ei.c2
            public final /* synthetic */ h2 b;

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
                        h2 h2Var = this.b;
                        int i152 = h2Var.d.k;
                        if (i152 != 1) {
                            if (i152 == 0) {
                                h2Var.e.requestFocus();
                                break;
                            }
                        } else {
                            h2Var.b();
                            g2 g2Var = h2Var.h;
                            if (g2Var != null) {
                                g2Var.J1();
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
            g2 g2Var = this.h;
            FrameLayout frameLayout = this.b;
            if (g2Var != null) {
                frameLayout.removeView(g2Var);
            }
            g2 g2Var2 = new g2(this, getContext(), i10 == 1 ? 3 : 0, this.a, z10);
            this.h = g2Var2;
            e2 e2Var = this.e;
            g2Var2.setDontOccupyWidth(AndroidUtilities.dp(16.0f) + ((int) e2Var.getPaint().measureText(((Object) e2Var.getHint()) + "")));
            final int i11 = 0;
            this.h.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) { // from class: ei.d2
                public final /* synthetic */ h2 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i11) {
                        case 0:
                            h2 h2Var = this.b;
                            e2 e2Var2 = h2Var.e;
                            e2Var2.animate().cancel();
                            e2Var2.setTranslationX(-Math.max(0, ((Integer) obj).intValue()));
                            h2Var.d(false);
                            break;
                        default:
                            qx0 qx0Var = (qx0) obj;
                            h2 h2Var2 = this.b;
                            g2 g2Var3 = h2Var2.h;
                            if (g2Var3 != null) {
                                if (g2Var3.getSelectedCategory() != qx0Var) {
                                    h2Var2.h.L1(qx0Var);
                                    String str = qx0Var.a;
                                    int categoryIndex = h2Var2.h.getCategoryIndex();
                                    Utilities.Callback2 callback2 = h2Var2.w;
                                    if (callback2 != null) {
                                        callback2.run(str, Integer.valueOf(categoryIndex));
                                        break;
                                    }
                                } else {
                                    h2Var2.h.L1(null);
                                    Utilities.Callback2 callback22 = h2Var2.w;
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
            this.h.setOnCategoryClick(new Utilities.Callback(this) { // from class: ei.d2
                public final /* synthetic */ h2 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i12) {
                        case 0:
                            h2 h2Var = this.b;
                            e2 e2Var2 = h2Var.e;
                            e2Var2.animate().cancel();
                            e2Var2.setTranslationX(-Math.max(0, ((Integer) obj).intValue()));
                            h2Var.d(false);
                            break;
                        default:
                            qx0 qx0Var = (qx0) obj;
                            h2 h2Var2 = this.b;
                            g2 g2Var3 = h2Var2.h;
                            if (g2Var3 != null) {
                                if (g2Var3.getSelectedCategory() != qx0Var) {
                                    h2Var2.h.L1(qx0Var);
                                    String str = qx0Var.a;
                                    int categoryIndex = h2Var2.h.getCategoryIndex();
                                    Utilities.Callback2 callback2 = h2Var2.w;
                                    if (callback2 != null) {
                                        callback2.run(str, Integer.valueOf(categoryIndex));
                                        break;
                                    }
                                } else {
                                    h2Var2.h.L1(null);
                                    Utilities.Callback2 callback22 = h2Var2.w;
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
            frameLayout.addView(this.h, Math.max(0, frameLayout.getChildCount() - 1), w7.z5.d(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
        }
    }

    public final void b() {
        this.e.setText("");
        Utilities.Callback2 callback2 = this.w;
        if (callback2 != null) {
            callback2.run(null, -1);
        }
        g2 g2Var = this.h;
        if (g2Var != null) {
            g2Var.L1(null);
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
        g2 g2Var;
        g2 g2Var2;
        boolean z11 = this.v;
        e2 e2Var = this.e;
        if (!z11 || ((e2Var.length() == 0 && ((g2Var2 = this.h) == null || g2Var2.getSelectedCategory() == null)) || z10)) {
            this.d.b((e2Var.length() > 0 || ((g2Var = this.h) != null && g2Var.p3 > 0.5f && ((g2Var != null && g2Var.k3) || g2Var.getSelectedCategory() != null))) ? 1 : 0);
            this.v = false;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        try {
            zn0 zn0Var = this.d;
            org.telegram.ui.ActionBar.g6 g6Var = this.a;
            if (zn0Var != null) {
                zn0Var.a(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Je, g6Var));
            }
            ImageView imageView = this.c;
            if (imageView != null) {
                imageView.invalidate();
            }
            e2 e2Var = this.e;
            if (e2Var != null) {
                int i10 = org.telegram.ui.ActionBar.k6.Mh;
                e2Var.setCursorColor(org.telegram.ui.ActionBar.k6.w0(i10, g6Var));
                e2Var.setHandlesColor(org.telegram.ui.ActionBar.k6.w0(i10, g6Var));
            }
            ImageView imageView2 = this.r;
            if (imageView2 != null) {
                imageView2.invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
