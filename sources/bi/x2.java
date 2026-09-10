package bi;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.dx0;
import org.telegram.ui.Components.hn0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class x2 extends FrameLayout {
    public final org.telegram.ui.ActionBar.f6 a;
    public final FrameLayout b;
    public final hn0 c;
    public final t2 d;
    public final int e;
    public w2 f;
    public boolean h;
    public final ImageView n;
    public boolean r;
    public boolean s;
    public Utilities.Callback2 v;

    public x2(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.e = -1;
        this.a = f6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        frameLayout.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ie, f6Var)));
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new g(1));
        addView(frameLayout, w7.a6.d(-1, 36.0f, 119, 10.0f, 6.0f, 10.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout.addView(frameLayout2, w7.a6.d(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        hn0 hn0Var = new hn0();
        this.c = hn0Var;
        hn0Var.c(0, false, false);
        int i10 = org.telegram.ui.ActionBar.j6.Je;
        hn0Var.a(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        imageView.setImageDrawable(hn0Var);
        frameLayout.addView(imageView, w7.a6.e(36, 36, 51));
        t2 t2Var = new t2(this, context, 0);
        this.d = t2Var;
        t2Var.setTextSize(1, 16.0f);
        t2Var.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        t2Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        t2Var.setBackgroundDrawable(null);
        t2Var.setPadding(0, 0, 0, 0);
        t2Var.setMaxLines(1);
        t2Var.setLines(1);
        t2Var.setSingleLine(true);
        t2Var.setImeOptions(268435459);
        t2Var.setHint(LocaleController.getString(R.string.Search));
        int i11 = org.telegram.ui.ActionBar.j6.Mh;
        t2Var.setCursorColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        t2Var.setHandlesColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        t2Var.setCursorSize(AndroidUtilities.dp(20.0f));
        t2Var.setCursorWidth(1.5f);
        t2Var.setTranslationY(AndroidUtilities.dp(-2.0f));
        frameLayout2.addView(t2Var, w7.a6.d(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
        t2Var.addTextChangedListener(new u2(this, 0));
        ImageView imageView2 = new ImageView(context);
        this.n = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new v2(f6Var));
        imageView2.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, f6Var), 1, AndroidUtilities.dp(15.0f)));
        imageView2.setAlpha(0.0f);
        imageView2.setScaleX(0.7f);
        imageView2.setScaleY(0.7f);
        imageView2.setVisibility(8);
        final int i12 = 0;
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: bi.r2
            public final /* synthetic */ x2 b;

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
                        x2 x2Var = this.b;
                        int i13 = x2Var.c.k;
                        if (i13 != 1) {
                            if (i13 == 0) {
                                x2Var.d.requestFocus();
                                break;
                            }
                        } else {
                            x2Var.b();
                            w2 w2Var = x2Var.f;
                            if (w2Var != null) {
                                w2Var.C1();
                                break;
                            }
                        }
                        break;
                }
            }
        });
        frameLayout.addView(imageView2, w7.a6.e(36, 36, 53));
        final int i13 = 1;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: bi.r2
            public final /* synthetic */ x2 b;

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
                        x2 x2Var = this.b;
                        int i132 = x2Var.c.k;
                        if (i132 != 1) {
                            if (i132 == 0) {
                                x2Var.d.requestFocus();
                                break;
                            }
                        } else {
                            x2Var.b();
                            w2 w2Var = x2Var.f;
                            if (w2Var != null) {
                                w2Var.C1();
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
            w2 w2Var = this.f;
            FrameLayout frameLayout = this.b;
            if (w2Var != null) {
                frameLayout.removeView(w2Var);
            }
            w2 w2Var2 = new w2(this, getContext(), i10 == 1 ? 3 : 0, this.a, z10);
            this.f = w2Var2;
            t2 t2Var = this.d;
            w2Var2.setDontOccupyWidth(AndroidUtilities.dp(16.0f) + ((int) t2Var.getPaint().measureText(((Object) t2Var.getHint()) + "")));
            final int i11 = 0;
            this.f.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) { // from class: bi.s2
                public final /* synthetic */ x2 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i11) {
                        case 0:
                            x2 x2Var = this.b;
                            t2 t2Var2 = x2Var.d;
                            t2Var2.animate().cancel();
                            t2Var2.setTranslationX(-Math.max(0, ((Integer) obj).intValue()));
                            x2Var.d(false);
                            break;
                        default:
                            dx0 dx0Var = (dx0) obj;
                            x2 x2Var2 = this.b;
                            w2 w2Var3 = x2Var2.f;
                            if (w2Var3 != null) {
                                if (w2Var3.getSelectedCategory() != dx0Var) {
                                    x2Var2.f.E1(dx0Var);
                                    String str = dx0Var.a;
                                    int categoryIndex = x2Var2.f.getCategoryIndex();
                                    Utilities.Callback2 callback2 = x2Var2.v;
                                    if (callback2 != null) {
                                        callback2.run(str, Integer.valueOf(categoryIndex));
                                        break;
                                    }
                                } else {
                                    x2Var2.f.E1(null);
                                    Utilities.Callback2 callback22 = x2Var2.v;
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
            this.f.setOnCategoryClick(new Utilities.Callback(this) { // from class: bi.s2
                public final /* synthetic */ x2 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i12) {
                        case 0:
                            x2 x2Var = this.b;
                            t2 t2Var2 = x2Var.d;
                            t2Var2.animate().cancel();
                            t2Var2.setTranslationX(-Math.max(0, ((Integer) obj).intValue()));
                            x2Var.d(false);
                            break;
                        default:
                            dx0 dx0Var = (dx0) obj;
                            x2 x2Var2 = this.b;
                            w2 w2Var3 = x2Var2.f;
                            if (w2Var3 != null) {
                                if (w2Var3.getSelectedCategory() != dx0Var) {
                                    x2Var2.f.E1(dx0Var);
                                    String str = dx0Var.a;
                                    int categoryIndex = x2Var2.f.getCategoryIndex();
                                    Utilities.Callback2 callback2 = x2Var2.v;
                                    if (callback2 != null) {
                                        callback2.run(str, Integer.valueOf(categoryIndex));
                                        break;
                                    }
                                } else {
                                    x2Var2.f.E1(null);
                                    Utilities.Callback2 callback22 = x2Var2.v;
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
            frameLayout.addView(this.f, Math.max(0, frameLayout.getChildCount() - 1), w7.a6.d(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
        }
    }

    public final void b() {
        this.d.setText("");
        Utilities.Callback2 callback2 = this.v;
        if (callback2 != null) {
            callback2.run(null, -1);
        }
        w2 w2Var = this.f;
        if (w2Var != null) {
            w2Var.E1(null);
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
        w2 w2Var;
        w2 w2Var2;
        boolean z11 = this.s;
        t2 t2Var = this.d;
        if (!z11 || ((t2Var.length() == 0 && ((w2Var2 = this.f) == null || w2Var2.getSelectedCategory() == null)) || z10)) {
            this.c.b((t2Var.length() > 0 || ((w2Var = this.f) != null && w2Var.o3 > 0.5f && ((w2Var != null && w2Var.j3) || w2Var.getSelectedCategory() != null))) ? 1 : 0);
            this.s = false;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), TLObject.FLAG_30));
    }
}
