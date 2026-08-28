package kh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.im0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class g2 extends FrameLayout {
    public final org.telegram.ui.ActionBar.b6 a;
    public final FrameLayout b;
    public final im0 c;
    public final fg.g d;
    public final int e;
    public f2 f;
    public boolean h;
    public final ImageView n;
    public boolean r;
    public boolean s;
    public Utilities.Callback2 v;

    public g2(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.e = -1;
        this.a = b6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        frameLayout.setBackground(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Ie, b6Var)));
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new bg.q1(6));
        addView(frameLayout, g7.e6.d(-1, 36.0f, 119, 10.0f, 6.0f, 10.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout.addView(frameLayout2, g7.e6.d(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        im0 im0Var = new im0();
        this.c = im0Var;
        im0Var.c(0, false, false);
        int i9 = org.telegram.ui.ActionBar.f6.Je;
        im0Var.a(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        imageView.setImageDrawable(im0Var);
        frameLayout.addView(imageView, g7.e6.e(36, 36, 51));
        fg.g gVar = new fg.g(this, context, 1);
        this.d = gVar;
        gVar.setTextSize(1, 16.0f);
        gVar.setHintTextColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        gVar.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, b6Var));
        gVar.setBackgroundDrawable(null);
        gVar.setPadding(0, 0, 0, 0);
        gVar.setMaxLines(1);
        gVar.setLines(1);
        gVar.setSingleLine(true);
        gVar.setImeOptions(268435459);
        gVar.setHint(LocaleController.getString(R.string.Search));
        int i10 = org.telegram.ui.ActionBar.f6.Mh;
        gVar.setCursorColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        gVar.setHandlesColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        gVar.setCursorSize(AndroidUtilities.dp(20.0f));
        gVar.setCursorWidth(1.5f);
        gVar.setTranslationY(AndroidUtilities.dp(-2.0f));
        frameLayout2.addView(gVar, g7.e6.d(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
        gVar.addTextChangedListener(new bh.f(this, 3));
        ImageView imageView2 = new ImageView(context);
        this.n = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new e2(b6Var));
        imageView2.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.i6, b6Var), 1, AndroidUtilities.dp(15.0f)));
        imageView2.setAlpha(0.0f);
        imageView2.setScaleX(0.7f);
        imageView2.setScaleY(0.7f);
        imageView2.setVisibility(8);
        final int i11 = 0;
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: kh.c2
            public final /* synthetic */ g2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.b.b();
                        break;
                    default:
                        g2 g2Var = this.b;
                        int i12 = g2Var.c.k;
                        if (i12 != 1) {
                            if (i12 == 0) {
                                g2Var.d.requestFocus();
                                break;
                            }
                        } else {
                            g2Var.b();
                            f2 f2Var = g2Var.f;
                            if (f2Var != null) {
                                f2Var.D1();
                                break;
                            }
                        }
                        break;
                }
            }
        });
        frameLayout.addView(imageView2, g7.e6.e(36, 36, 53));
        final int i12 = 1;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: kh.c2
            public final /* synthetic */ g2 b;

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
                        g2 g2Var = this.b;
                        int i122 = g2Var.c.k;
                        if (i122 != 1) {
                            if (i122 == 0) {
                                g2Var.d.requestFocus();
                                break;
                            }
                        } else {
                            g2Var.b();
                            f2 f2Var = g2Var.f;
                            if (f2Var != null) {
                                f2Var.D1();
                                break;
                            }
                        }
                        break;
                }
            }
        });
    }

    public final void a(int i9, boolean z10) {
        if (this.e != i9 || this.f == null) {
            f2 f2Var = this.f;
            FrameLayout frameLayout = this.b;
            if (f2Var != null) {
                frameLayout.removeView(f2Var);
            }
            f2 f2Var2 = new f2(this, getContext(), i9 == 1 ? 3 : 0, this.a, z10);
            this.f = f2Var2;
            fg.g gVar = this.d;
            f2Var2.setDontOccupyWidth(AndroidUtilities.dp(16.0f) + ((int) gVar.getPaint().measureText(((Object) gVar.getHint()) + "")));
            final int i10 = 0;
            this.f.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) { // from class: kh.d2
                public final /* synthetic */ g2 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i10) {
                        case 0:
                            g2 g2Var = this.b;
                            fg.g gVar2 = g2Var.d;
                            gVar2.animate().cancel();
                            gVar2.setTranslationX(-Math.max(0, ((Integer) obj).intValue()));
                            g2Var.d(false);
                            break;
                        default:
                            aw0 aw0Var = (aw0) obj;
                            g2 g2Var2 = this.b;
                            f2 f2Var3 = g2Var2.f;
                            if (f2Var3 != null) {
                                if (f2Var3.getSelectedCategory() != aw0Var) {
                                    g2Var2.f.F1(aw0Var);
                                    String str = aw0Var.a;
                                    int categoryIndex = g2Var2.f.getCategoryIndex();
                                    Utilities.Callback2 callback2 = g2Var2.v;
                                    if (callback2 != null) {
                                        callback2.run(str, Integer.valueOf(categoryIndex));
                                        break;
                                    }
                                } else {
                                    g2Var2.f.F1(null);
                                    Utilities.Callback2 callback22 = g2Var2.v;
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
            final int i11 = 1;
            this.f.setOnCategoryClick(new Utilities.Callback(this) { // from class: kh.d2
                public final /* synthetic */ g2 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i11) {
                        case 0:
                            g2 g2Var = this.b;
                            fg.g gVar2 = g2Var.d;
                            gVar2.animate().cancel();
                            gVar2.setTranslationX(-Math.max(0, ((Integer) obj).intValue()));
                            g2Var.d(false);
                            break;
                        default:
                            aw0 aw0Var = (aw0) obj;
                            g2 g2Var2 = this.b;
                            f2 f2Var3 = g2Var2.f;
                            if (f2Var3 != null) {
                                if (f2Var3.getSelectedCategory() != aw0Var) {
                                    g2Var2.f.F1(aw0Var);
                                    String str = aw0Var.a;
                                    int categoryIndex = g2Var2.f.getCategoryIndex();
                                    Utilities.Callback2 callback2 = g2Var2.v;
                                    if (callback2 != null) {
                                        callback2.run(str, Integer.valueOf(categoryIndex));
                                        break;
                                    }
                                } else {
                                    g2Var2.f.F1(null);
                                    Utilities.Callback2 callback22 = g2Var2.v;
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
            frameLayout.addView(this.f, Math.max(0, frameLayout.getChildCount() - 1), g7.e6.d(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
        }
    }

    public final void b() {
        this.d.setText("");
        Utilities.Callback2 callback2 = this.v;
        if (callback2 != null) {
            callback2.run(null, -1);
        }
        f2 f2Var = this.f;
        if (f2Var != null) {
            f2Var.F1(null);
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
        f2 f2Var;
        f2 f2Var2;
        boolean z11 = this.s;
        fg.g gVar = this.d;
        if (!z11 || ((gVar.length() == 0 && ((f2Var2 = this.f) == null || f2Var2.getSelectedCategory() == null)) || z10)) {
            this.c.b((gVar.length() > 0 || ((f2Var = this.f) != null && f2Var.k3 > 0.5f && ((f2Var != null && f2Var.f3) || f2Var.getSelectedCategory() != null))) ? 1 : 0);
            this.s = false;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), TLObject.FLAG_30));
    }
}
