package ei;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.nx0;
import org.telegram.ui.Components.wn0;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final class h2 extends FrameLayout {
    public final org.telegram.ui.ActionBar.d6 a;
    public final FrameLayout b;
    public final wn0 c;
    public final e2 d;
    public final int e;
    public g2 f;
    public boolean h;
    public final ImageView n;
    public boolean r;
    public boolean s;
    public Utilities.Callback2 v;

    public h2(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.e = -1;
        this.a = d6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        frameLayout.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Ie, d6Var)));
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new ci.o1(2));
        addView(frameLayout, w7.z5.d(-1, 36.0f, 119, 10.0f, 6.0f, 10.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout.addView(frameLayout2, w7.z5.d(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        wn0 wn0Var = new wn0();
        this.c = wn0Var;
        wn0Var.c(0, false, false);
        int i10 = org.telegram.ui.ActionBar.h6.Je;
        wn0Var.a(org.telegram.ui.ActionBar.h6.w0(i10, d6Var));
        imageView.setImageDrawable(wn0Var);
        frameLayout.addView(imageView, w7.z5.e(36, 36, 51));
        e2 e2Var = new e2(this, context, 0);
        this.d = e2Var;
        e2Var.setTextSize(1, 16.0f);
        e2Var.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(i10, d6Var));
        e2Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, d6Var));
        e2Var.setBackgroundDrawable(null);
        e2Var.setPadding(0, 0, 0, 0);
        e2Var.setMaxLines(1);
        e2Var.setLines(1);
        e2Var.setSingleLine(true);
        e2Var.setImeOptions(268435459);
        e2Var.setHint(LocaleController.getString(R.string.Search));
        int i11 = org.telegram.ui.ActionBar.h6.Mh;
        e2Var.setCursorColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        e2Var.setHandlesColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        e2Var.setCursorSize(AndroidUtilities.dp(20.0f));
        e2Var.setCursorWidth(1.5f);
        e2Var.setTranslationY(AndroidUtilities.dp(-2.0f));
        frameLayout2.addView(e2Var, w7.z5.d(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
        e2Var.addTextChangedListener(new ai.u(this, 1));
        ImageView imageView2 = new ImageView(context);
        this.n = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new f2(d6Var));
        imageView2.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.i6, d6Var), 1, AndroidUtilities.dp(15.0f)));
        imageView2.setAlpha(0.0f);
        imageView2.setScaleX(0.7f);
        imageView2.setScaleY(0.7f);
        imageView2.setVisibility(8);
        final int i12 = 0;
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: ei.c2
            public final /* synthetic */ h2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        this.b.b();
                        break;
                    default:
                        h2 h2Var = this.b;
                        int i13 = h2Var.c.k;
                        if (i13 != 1) {
                            if (i13 == 0) {
                                h2Var.d.requestFocus();
                                break;
                            }
                        } else {
                            h2Var.b();
                            g2 g2Var = h2Var.f;
                            if (g2Var != null) {
                                g2Var.E1();
                                break;
                            }
                        }
                        break;
                }
            }
        });
        frameLayout.addView(imageView2, w7.z5.e(36, 36, 53));
        final int i13 = 1;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: ei.c2
            public final /* synthetic */ h2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        this.b.b();
                        break;
                    default:
                        h2 h2Var = this.b;
                        int i132 = h2Var.c.k;
                        if (i132 != 1) {
                            if (i132 == 0) {
                                h2Var.d.requestFocus();
                                break;
                            }
                        } else {
                            h2Var.b();
                            g2 g2Var = h2Var.f;
                            if (g2Var != null) {
                                g2Var.E1();
                                break;
                            }
                        }
                        break;
                }
            }
        });
    }

    public final void a(int i10, boolean z10) {
        if (this.e != i10 || this.f == null) {
            g2 g2Var = this.f;
            FrameLayout frameLayout = this.b;
            if (g2Var != null) {
                frameLayout.removeView(g2Var);
            }
            g2 g2Var2 = new g2(this, getContext(), i10 == 1 ? 3 : 0, this.a, z10);
            this.f = g2Var2;
            e2 e2Var = this.d;
            g2Var2.setDontOccupyWidth(AndroidUtilities.dp(16.0f) + ((int) e2Var.getPaint().measureText(((Object) e2Var.getHint()) + "")));
            final int i11 = 0;
            this.f.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) { // from class: ei.d2
                public final /* synthetic */ h2 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i11) {
                        case 0:
                            h2 h2Var = this.b;
                            e2 e2Var2 = h2Var.d;
                            e2Var2.animate().cancel();
                            e2Var2.setTranslationX(-Math.max(0, ((Integer) obj).intValue()));
                            h2Var.d(false);
                            break;
                        default:
                            nx0 nx0Var = (nx0) obj;
                            h2 h2Var2 = this.b;
                            g2 g2Var3 = h2Var2.f;
                            if (g2Var3 != null) {
                                if (g2Var3.getSelectedCategory() != nx0Var) {
                                    h2Var2.f.G1(nx0Var);
                                    String str = nx0Var.a;
                                    int categoryIndex = h2Var2.f.getCategoryIndex();
                                    Utilities.Callback2 callback2 = h2Var2.v;
                                    if (callback2 != null) {
                                        callback2.run(str, Integer.valueOf(categoryIndex));
                                        break;
                                    }
                                } else {
                                    h2Var2.f.G1(null);
                                    Utilities.Callback2 callback22 = h2Var2.v;
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
            this.f.setOnCategoryClick(new Utilities.Callback(this) { // from class: ei.d2
                public final /* synthetic */ h2 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i12) {
                        case 0:
                            h2 h2Var = this.b;
                            e2 e2Var2 = h2Var.d;
                            e2Var2.animate().cancel();
                            e2Var2.setTranslationX(-Math.max(0, ((Integer) obj).intValue()));
                            h2Var.d(false);
                            break;
                        default:
                            nx0 nx0Var = (nx0) obj;
                            h2 h2Var2 = this.b;
                            g2 g2Var3 = h2Var2.f;
                            if (g2Var3 != null) {
                                if (g2Var3.getSelectedCategory() != nx0Var) {
                                    h2Var2.f.G1(nx0Var);
                                    String str = nx0Var.a;
                                    int categoryIndex = h2Var2.f.getCategoryIndex();
                                    Utilities.Callback2 callback2 = h2Var2.v;
                                    if (callback2 != null) {
                                        callback2.run(str, Integer.valueOf(categoryIndex));
                                        break;
                                    }
                                } else {
                                    h2Var2.f.G1(null);
                                    Utilities.Callback2 callback22 = h2Var2.v;
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
            frameLayout.addView(this.f, Math.max(0, frameLayout.getChildCount() - 1), w7.z5.d(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
        }
    }

    public final void b() {
        this.d.setText("");
        Utilities.Callback2 callback2 = this.v;
        if (callback2 != null) {
            callback2.run(null, -1);
        }
        g2 g2Var = this.f;
        if (g2Var != null) {
            g2Var.G1(null);
        }
    }

    public final void c(boolean z10) {
        this.s = z10;
        if (z10) {
            this.c.b(2);
        } else {
            d(true);
        }
    }

    public final void d(boolean z10) {
        g2 g2Var;
        g2 g2Var2;
        boolean z11 = this.s;
        e2 e2Var = this.d;
        if (!z11 || ((e2Var.length() == 0 && ((g2Var2 = this.f) == null || g2Var2.getSelectedCategory() == null)) || z10)) {
            this.c.b((e2Var.length() > 0 || ((g2Var = this.f) != null && g2Var.m3 > 0.5f && ((g2Var != null && g2Var.h3) || g2Var.getSelectedCategory() != null))) ? 1 : 0);
            this.s = false;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), TLObject.FLAG_30));
    }
}
