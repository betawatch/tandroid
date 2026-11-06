package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import org.telegram.messenger.beta.R;
import org.telegram.ui.u71;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class a20 extends c5.a {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a20(Object obj, int i7) {
        this.c = i7;
        this.d = obj;
    }

    @Override // c5.a
    public final void a(c5.k kVar, Object obj) {
        switch (this.c) {
            case 0:
                kVar.removeView((View) obj);
                break;
            case 1:
                kVar.removeView((View) obj);
                break;
            case 2:
                kVar.removeView((View) obj);
                break;
            case 3:
                kVar.removeView((View) obj);
                break;
            default:
                kVar.removeView((View) obj);
                break;
        }
    }

    @Override // c5.a
    public final int b() {
        switch (this.c) {
            case 0:
                return ((org.telegram.ui.c30) this.d).l1.length;
            case 1:
                return ((org.telegram.ui.Components.voip.t0) this.d).f.length;
            case 2:
                return ((org.telegram.ui.u50) this.d).F.length;
            case 3:
                return ((u71) this.d).b != 0 ? 1 : 2;
            default:
                return ((ug.w0) this.d).k1.size();
        }
    }

    @Override // c5.a
    public int c(Object obj) {
        switch (this.c) {
            case 3:
                return -1;
            default:
                return super.c(obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r26v0, types: [android.view.View, android.view.ViewGroup, c5.k] */
    /* JADX WARN: Type inference failed for: r2v17, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    @Override // c5.a
    public final Object e(c5.k kVar, int i7) {
        ImageView imageView;
        int i10 = this.c;
        int i11 = 13;
        int i12 = 2;
        Bitmap bitmap = null;
        Object obj = this.d;
        switch (i10) {
            case 0:
                z10 z10Var = new z10(this, ((org.telegram.ui.c30) obj).getContext(), i7, r12);
                z10Var.setOnClickListener(new ai.v(this, i7, i11));
                z10Var.setFocusable(true);
                z10Var.setTag(Integer.valueOf(i7));
                z10Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
                z10Var.setScaleType(ImageView.ScaleType.FIT_XY);
                z10Var.setLayoutParams(new ViewGroup.LayoutParams(org.telegram.messenger.g0.L(200.0f), -1));
                if (i7 == 0) {
                    z10Var.setContentDescription(org.telegram.messenger.hd.M0(2131743253, null));
                } else if (i7 == 1) {
                    z10Var.setContentDescription(org.telegram.messenger.hd.M0(2131743251, null));
                } else {
                    z10Var.setContentDescription(org.telegram.messenger.hd.M0(2131743252, null));
                }
                org.telegram.messenger.rz i13 = org.telegram.messenger.sz.i(org.telegram.messenger.g0.y2(null, i7 == 0 ? R.raw.record_audio : i7 == 1 ? R.raw.record_video_p : R.raw.record_video_l));
                i13.s = false;
                z10Var.setImageDrawable(i13);
                if (z10Var.getParent() != null) {
                    ((ViewGroup) z10Var.getParent()).removeView(z10Var);
                }
                kVar.addView(z10Var, 0);
                return z10Var;
            case 1:
                org.telegram.ui.Components.voip.t0 t0Var = (org.telegram.ui.Components.voip.t0) obj;
                boolean z9 = t0Var.D;
                if (z9 && i7 == 0) {
                    ?? frameLayout = new FrameLayout(t0Var.getContext());
                    frameLayout.setBackground(new qa0(true, -14602694, -13935795, -14395293, -14203560));
                    ImageView imageView2 = new ImageView(t0Var.getContext());
                    imageView2.setScaleType(ImageView.ScaleType.CENTER);
                    imageView2.setImageResource(R.drawable.screencast_big);
                    frameLayout.addView(imageView2, c8.ha.d(82, 82.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
                    TextView textView = new TextView(t0Var.getContext());
                    textView.setText(org.telegram.messenger.hd.M0(2131743224, null));
                    textView.setGravity(17);
                    textView.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                    textView.setTextColor(-1);
                    textView.setTextSize(1, 15.0f);
                    textView.setTypeface(org.telegram.messenger.g0.o());
                    frameLayout.addView(textView, c8.ha.d(-1, -2.0f, 17, 21.0f, 28.0f, 21.0f, 0.0f));
                    imageView = frameLayout;
                } else {
                    ImageView imageView3 = new ImageView(t0Var.getContext());
                    imageView3.setTag(Integer.valueOf(i7));
                    try {
                        File h = org.telegram.messenger.t0.h();
                        StringBuilder sb2 = new StringBuilder("cthumb");
                        if (i7 == 0 || (i7 == 1 && z9)) {
                            i12 = 1;
                        }
                        sb2.append(i12);
                        sb2.append(".jpg");
                        bitmap = BitmapFactory.decodeFile(new File(h, sb2.toString()).getAbsolutePath());
                    } catch (Throwable unused) {
                    }
                    if (bitmap != null) {
                        imageView3.setImageBitmap(bitmap);
                    } else {
                        imageView3.setImageResource(R.drawable.icplaceholder);
                    }
                    imageView3.setScaleType(ImageView.ScaleType.FIT_XY);
                    imageView = imageView3;
                }
                if (imageView.getParent() != null) {
                    ((ViewGroup) imageView.getParent()).removeView(imageView);
                }
                kVar.addView(imageView, 0);
                return imageView;
            case 2:
                TextView textView2 = new TextView(kVar.getContext());
                org.telegram.ui.u50 u50Var = (org.telegram.ui.u50) obj;
                textView2.setTag(u50Var.a);
                TextView textView3 = new TextView(kVar.getContext());
                textView3.setTag(u50Var.b);
                bi.x5 x5Var = new bi.x5(kVar.getContext(), textView2, textView3);
                int i14 = org.telegram.ui.ActionBar.k6.G6;
                org.telegram.messenger.k5.n(textView2, i14, null, 1, 26.0f);
                textView2.setGravity(17);
                x5Var.addView(textView2, c8.ha.d(-1, -2.0f, 51, 18.0f, 244.0f, 18.0f, 0.0f));
                org.telegram.ui.ActionBar.r6.V(textView3, i14, null);
                textView3.setTextSize(1, 15.0f);
                textView3.setLineSpacing(org.telegram.messenger.g0.N(2.33f), 1.0f);
                textView3.setGravity(17);
                x5Var.addView(textView3, c8.ha.d(-1, -2.0f, 51, 16.0f, 286.0f, 16.0f, 0.0f));
                kVar.addView(x5Var, 0);
                textView2.setText(u50Var.F[i7]);
                textView3.setText(org.telegram.messenger.g0.X2(u50Var.G[i7]));
                return x5Var;
            case 3:
                u71 u71Var = (u71) obj;
                View view = i7 == 0 ? u71Var.u0 : u71Var.n0;
                kVar.addView(view);
                return view;
            default:
                ug.w0 w0Var = (ug.w0) obj;
                ug.v0 v0Var = new ug.v0(w0Var, w0Var.getContext(), i7);
                kVar.addView(v0Var);
                v0Var.a = i7;
                org.telegram.ui.vs0 vs0Var = (org.telegram.ui.vs0) w0Var.k1.get(i7);
                int i15 = vs0Var.a;
                String str = vs0Var.d;
                CharSequence charSequence = vs0Var.c;
                TextView textView4 = v0Var.b;
                w70 w70Var = v0Var.c;
                if (i15 == 0 || i15 == 14 || i15 == 28) {
                    textView4.setText("");
                    w70Var.setText("");
                    v0Var.h = true;
                } else if (w0Var.v1) {
                    int i16 = w0Var.u1;
                    if (i16 == 4) {
                        textView4.setText(org.telegram.messenger.hd.M0(2131754353, null));
                        w70Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131754352, null)));
                    } else if (i16 == 3) {
                        textView4.setText(org.telegram.messenger.hd.M0(2131746991, null));
                        w70Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131746989, null)));
                    } else if (i16 == 24) {
                        textView4.setText(org.telegram.messenger.hd.M0(2131746971, null));
                        w70Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131746969, null)));
                    } else if (i16 == 10) {
                        textView4.setText(org.telegram.messenger.hd.M0(2131747019, null));
                        w70Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131747017, null)));
                    } else if (i16 == 2) {
                        textView4.setText(org.telegram.messenger.hd.M0(2131747011, null));
                        w70Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131747009, null)));
                    } else if (i16 == 9) {
                        textView4.setText(org.telegram.messenger.hd.M0(2131747024, null));
                        w70Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131747022, null)));
                    } else if (i16 == 8) {
                        textView4.setText(org.telegram.messenger.hd.M0(2131746961, null));
                        w70Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131746959, null)));
                    } else if (i16 == 13) {
                        textView4.setText(org.telegram.messenger.hd.M0(2131746965, null));
                        w70Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131746964, null)));
                    } else if (i16 == 38) {
                        textView4.setText(org.telegram.messenger.hd.M0(2131747008, null));
                        w70Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131747007, null)));
                    } else if (i16 == 22) {
                        textView4.setText(org.telegram.messenger.hd.M0(2131746958, null));
                        w70Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131746957, null)));
                    } else if (i16 == 23) {
                        textView4.setText(org.telegram.messenger.hd.M0(2131746984, null));
                        w70Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131746983, null)));
                    } else if (i16 == 41) {
                        textView4.setText(org.telegram.messenger.hd.M0(2131746977, null));
                        w70Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131746976, null)));
                    } else {
                        textView4.setText(charSequence);
                        w70Var.setText(org.telegram.messenger.g0.X2(str));
                    }
                    v0Var.h = false;
                } else {
                    textView4.setText(charSequence);
                    w70Var.setText(org.telegram.messenger.g0.X2(str));
                    v0Var.h = false;
                }
                w70Var.setMaxWidth(fi.m3.a(w70Var.getText(), w70Var.getPaint()));
                v0Var.requestLayout();
                boolean z10 = vs0Var.a == 40;
                if (z10 && v0Var.d == null) {
                    LinearLayout linearLayout = new LinearLayout(v0Var.getContext());
                    v0Var.d = linearLayout;
                    linearLayout.setOrientation(1);
                    Context context = v0Var.getContext();
                    int i17 = ug.w0.F1;
                    hi.i iVar = new hi.i(context, w0Var.I0, true);
                    iVar.a(R.drawable.menu_feature_unique, org.telegram.messenger.hd.M0(2131749573, null), org.telegram.messenger.hd.M0(2131749574, null));
                    v0Var.d.addView(r2[0], c8.ha.o(-1, -2));
                    hi.i iVar2 = new hi.i(v0Var.getContext(), w0Var.I0, true);
                    iVar2.a(R.drawable.menu_feature_tradable, org.telegram.messenger.hd.M0(2131749571, null), org.telegram.messenger.hd.M0(2131749572, null));
                    v0Var.d.addView(r2[1], c8.ha.o(-1, -2));
                    hi.i iVar3 = new hi.i(v0Var.getContext(), w0Var.I0, true);
                    hi.i[] iVarArr = {iVar, iVar2, iVar3};
                    iVar3.a(R.drawable.menu_wear, org.telegram.messenger.hd.M0(2131749569, null), org.telegram.messenger.hd.M0(2131749570, null));
                    v0Var.d.addView(iVarArr[2], c8.ha.o(-1, -2));
                    v0Var.addView(v0Var.d, c8.ha.k(0.0f, -4.0f, 0.0f, 0.0f, -1, -2));
                }
                LinearLayout linearLayout2 = v0Var.d;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(z10 ? 0 : 8);
                }
                ((ViewGroup.MarginLayoutParams) w70Var.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(z10 ? 6.0f : 10.0f);
                return v0Var;
        }
    }

    @Override // c5.a
    public final boolean f(View view, Object obj) {
        switch (this.c) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                if (obj == view) {
                }
                break;
            default:
                if (view == obj) {
                }
                break;
        }
        return view.equals(obj);
    }

    @Override // c5.a
    public void h(int i7) {
        switch (this.c) {
            case 2:
                org.telegram.ui.u50 u50Var = (org.telegram.ui.u50) this.d;
                u50Var.e.setCurrentPage(i7);
                u50Var.H = i7;
                break;
        }
    }

    private final void j(int i7) {
    }

    private final void k(int i7) {
    }
}
