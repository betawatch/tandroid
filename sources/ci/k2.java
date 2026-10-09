package ci;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.do0;
import org.telegram.ui.Components.ux0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class k2 extends FrameLayout {
    public final org.telegram.ui.ActionBar.e6 a;
    public final FrameLayout b;
    public final do0 c;
    public final g2 d;
    public final int e;
    public j2 f;
    public boolean h;
    public final ImageView n;
    public boolean r;
    public boolean s;
    public Utilities.Callback2 v;

    public k2(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.e = -1;
        this.a = e6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        frameLayout.setBackground(org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Ie, e6Var)));
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new ai.l2(2));
        addView(frameLayout, w7.x5.a(36.0f, 10.0f, 6.0f, 10.0f, 8.0f, -1, 119));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout.addView(frameLayout2, w7.x5.a(40.0f, 38.0f, 0.0f, 0.0f, 0.0f, -1, 51));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        do0 do0Var = new do0();
        this.c = do0Var;
        do0Var.c(0, false, false);
        int i10 = org.telegram.ui.ActionBar.i6.Je;
        do0Var.a(org.telegram.ui.ActionBar.i6.w0(i10, e6Var));
        imageView.setImageDrawable(do0Var);
        frameLayout.addView(imageView, w7.x5.e(36, 36, 51));
        g2 g2Var = new g2(this, context, 0);
        this.d = g2Var;
        g2Var.setTextSize(1, 16.0f);
        g2Var.setHintTextColor(org.telegram.ui.ActionBar.i6.w0(i10, e6Var));
        g2Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, e6Var));
        g2Var.setBackgroundDrawable(null);
        g2Var.setPadding(0, 0, 0, 0);
        g2Var.setMaxLines(1);
        g2Var.setLines(1);
        g2Var.setSingleLine(true);
        g2Var.setImeOptions(268435459);
        g2Var.setHint(LocaleController.getString(R.string.Search));
        int i11 = org.telegram.ui.ActionBar.i6.Mh;
        g2Var.setCursorColor(org.telegram.ui.ActionBar.i6.w0(i11, e6Var));
        g2Var.setHandlesColor(org.telegram.ui.ActionBar.i6.w0(i11, e6Var));
        g2Var.setCursorSize(AndroidUtilities.dp(20.0f));
        g2Var.setCursorWidth(1.5f);
        g2Var.setTranslationY(AndroidUtilities.dp(-2.0f));
        frameLayout2.addView(g2Var, w7.x5.a(40.0f, 0.0f, 0.0f, 28.0f, 0.0f, -1, 51));
        g2Var.addTextChangedListener(new h2(this, 0));
        ImageView imageView2 = new ImageView(context);
        this.n = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new i2(e6Var));
        imageView2.setBackground(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.i6, e6Var), 1, AndroidUtilities.dp(15.0f)));
        imageView2.setAlpha(0.0f);
        imageView2.setScaleX(0.7f);
        imageView2.setScaleY(0.7f);
        imageView2.setVisibility(8);
        final int i12 = 0;
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: ci.e2
            public final /* synthetic */ k2 b;

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
                        k2 k2Var = this.b;
                        int i13 = k2Var.c.k;
                        if (i13 != 1) {
                            if (i13 == 0) {
                                k2Var.d.requestFocus();
                                break;
                            }
                        } else {
                            k2Var.b();
                            j2 j2Var = k2Var.f;
                            if (j2Var != null) {
                                j2Var.E1();
                                break;
                            }
                        }
                        break;
                }
            }
        });
        frameLayout.addView(imageView2, w7.x5.e(36, 36, 53));
        final int i13 = 1;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: ci.e2
            public final /* synthetic */ k2 b;

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
                        k2 k2Var = this.b;
                        int i132 = k2Var.c.k;
                        if (i132 != 1) {
                            if (i132 == 0) {
                                k2Var.d.requestFocus();
                                break;
                            }
                        } else {
                            k2Var.b();
                            j2 j2Var = k2Var.f;
                            if (j2Var != null) {
                                j2Var.E1();
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
            j2 j2Var = this.f;
            FrameLayout frameLayout = this.b;
            if (j2Var != null) {
                frameLayout.removeView(j2Var);
            }
            j2 j2Var2 = new j2(this, getContext(), i10 == 1 ? 3 : 0, this.a, z10);
            this.f = j2Var2;
            g2 g2Var = this.d;
            j2Var2.setDontOccupyWidth(AndroidUtilities.dp(16.0f) + ((int) g2Var.getPaint().measureText(((Object) g2Var.getHint()) + "")));
            final int i11 = 0;
            this.f.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) { // from class: ci.f2
                public final /* synthetic */ k2 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i11) {
                        case 0:
                            k2 k2Var = this.b;
                            g2 g2Var2 = k2Var.d;
                            g2Var2.animate().cancel();
                            g2Var2.setTranslationX(-Math.max(0, ((Integer) obj).intValue()));
                            k2Var.d(false);
                            break;
                        default:
                            ux0 ux0Var = (ux0) obj;
                            k2 k2Var2 = this.b;
                            j2 j2Var3 = k2Var2.f;
                            if (j2Var3 != null) {
                                if (j2Var3.getSelectedCategory() != ux0Var) {
                                    k2Var2.f.G1(ux0Var);
                                    String str = ux0Var.a;
                                    int categoryIndex = k2Var2.f.getCategoryIndex();
                                    Utilities.Callback2 callback2 = k2Var2.v;
                                    if (callback2 != null) {
                                        callback2.run(str, Integer.valueOf(categoryIndex));
                                        break;
                                    }
                                } else {
                                    k2Var2.f.G1(null);
                                    Utilities.Callback2 callback22 = k2Var2.v;
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
            this.f.setOnCategoryClick(new Utilities.Callback(this) { // from class: ci.f2
                public final /* synthetic */ k2 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i12) {
                        case 0:
                            k2 k2Var = this.b;
                            g2 g2Var2 = k2Var.d;
                            g2Var2.animate().cancel();
                            g2Var2.setTranslationX(-Math.max(0, ((Integer) obj).intValue()));
                            k2Var.d(false);
                            break;
                        default:
                            ux0 ux0Var = (ux0) obj;
                            k2 k2Var2 = this.b;
                            j2 j2Var3 = k2Var2.f;
                            if (j2Var3 != null) {
                                if (j2Var3.getSelectedCategory() != ux0Var) {
                                    k2Var2.f.G1(ux0Var);
                                    String str = ux0Var.a;
                                    int categoryIndex = k2Var2.f.getCategoryIndex();
                                    Utilities.Callback2 callback2 = k2Var2.v;
                                    if (callback2 != null) {
                                        callback2.run(str, Integer.valueOf(categoryIndex));
                                        break;
                                    }
                                } else {
                                    k2Var2.f.G1(null);
                                    Utilities.Callback2 callback22 = k2Var2.v;
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
            frameLayout.addView(this.f, Math.max(0, frameLayout.getChildCount() - 1), w7.x5.a(36.0f, 36.0f, 0.0f, 0.0f, 0.0f, -1, 51));
        }
    }

    public final void b() {
        this.d.setText("");
        Utilities.Callback2 callback2 = this.v;
        if (callback2 != null) {
            callback2.run(null, -1);
        }
        j2 j2Var = this.f;
        if (j2Var != null) {
            j2Var.G1(null);
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
        j2 j2Var;
        j2 j2Var2;
        boolean z11 = this.s;
        g2 g2Var = this.d;
        if (!z11 || ((g2Var.length() == 0 && ((j2Var2 = this.f) == null || j2Var2.getSelectedCategory() == null)) || z10)) {
            this.c.b((g2Var.length() > 0 || ((j2Var = this.f) != null && j2Var.m3 > 0.5f && ((j2Var != null && j2Var.h3) || j2Var.getSelectedCategory() != null))) ? 1 : 0);
            this.s = false;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), TLObject.FLAG_30));
    }
}
