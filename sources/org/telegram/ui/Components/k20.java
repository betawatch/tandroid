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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class k20 extends c5.a {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ k20(Object obj, int i7) {
        this.c = i7;
        this.d = obj;
    }

    @Override // c5.a
    public final void a(c5.l lVar, Object obj) {
        switch (this.c) {
            case 0:
                lVar.removeView((View) obj);
                break;
            case 1:
                lVar.removeView((View) obj);
                break;
            case 2:
                lVar.removeView((View) obj);
                break;
            case 3:
                lVar.removeView((View) obj);
                break;
            default:
                lVar.removeView((View) obj);
                break;
        }
    }

    @Override // c5.a
    public final int b() {
        switch (this.c) {
            case 0:
                return ((org.telegram.ui.g30) this.d).p1.length;
            case 1:
                return ((org.telegram.ui.Components.voip.w0) this.d).f.length;
            case 2:
                return ((org.telegram.ui.v50) this.d).G.length;
            case 3:
                return ((org.telegram.ui.x71) this.d).b != 0 ? 1 : 2;
            default:
                return ((ug.z0) this.d).o1.size();
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
    /* JADX WARN: Type inference failed for: r25v0, types: [android.view.View, android.view.ViewGroup, c5.l] */
    /* JADX WARN: Type inference failed for: r2v17, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    @Override // c5.a
    public final Object e(c5.l lVar, int i7) {
        ImageView imageView;
        int i10 = this.c;
        int i11 = 2;
        Bitmap bitmap = null;
        Object obj = this.d;
        switch (i10) {
            case 0:
                j20 j20Var = new j20(this, ((org.telegram.ui.g30) obj).getContext(), i7, r11);
                j20Var.setOnClickListener(new ci.q(this, i7, 15));
                j20Var.setFocusable(true);
                j20Var.setTag(Integer.valueOf(i7));
                j20Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
                j20Var.setScaleType(ImageView.ScaleType.FIT_XY);
                j20Var.setLayoutParams(new ViewGroup.LayoutParams(org.telegram.messenger.g0.L(200.0f), -1));
                if (i7 == 0) {
                    j20Var.setContentDescription(org.telegram.messenger.gd.M0(2131743015, null));
                } else if (i7 == 1) {
                    j20Var.setContentDescription(org.telegram.messenger.gd.M0(2131743013, null));
                } else {
                    j20Var.setContentDescription(org.telegram.messenger.gd.M0(2131743014, null));
                }
                org.telegram.messenger.lz i12 = org.telegram.messenger.mz.i(org.telegram.messenger.g0.y2(null, i7 == 0 ? R.raw.record_audio : i7 == 1 ? R.raw.record_video_p : R.raw.record_video_l));
                i12.s = false;
                j20Var.setImageDrawable(i12);
                if (j20Var.getParent() != null) {
                    ((ViewGroup) j20Var.getParent()).removeView(j20Var);
                }
                lVar.addView(j20Var, 0);
                return j20Var;
            case 1:
                org.telegram.ui.Components.voip.w0 w0Var = (org.telegram.ui.Components.voip.w0) obj;
                boolean z10 = w0Var.E;
                if (z10 && i7 == 0) {
                    ?? frameLayout = new FrameLayout(w0Var.getContext());
                    frameLayout.setBackground(new bb0(true, -14602694, -13935795, -14395293, -14203560));
                    ImageView imageView2 = new ImageView(w0Var.getContext());
                    imageView2.setScaleType(ImageView.ScaleType.CENTER);
                    imageView2.setImageResource(R.drawable.screencast_big);
                    frameLayout.addView(imageView2, c8.ma.d(82, 82.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
                    TextView textView = new TextView(w0Var.getContext());
                    textView.setText(org.telegram.messenger.gd.M0(2131742986, null));
                    textView.setGravity(17);
                    textView.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                    textView.setTextColor(-1);
                    textView.setTextSize(1, 15.0f);
                    textView.setTypeface(org.telegram.messenger.g0.o());
                    frameLayout.addView(textView, c8.ma.d(-1, -2.0f, 17, 21.0f, 28.0f, 21.0f, 0.0f));
                    imageView = frameLayout;
                } else {
                    ImageView imageView3 = new ImageView(w0Var.getContext());
                    imageView3.setTag(Integer.valueOf(i7));
                    try {
                        File h = org.telegram.messenger.t0.h();
                        StringBuilder sb2 = new StringBuilder("cthumb");
                        if (i7 == 0 || (i7 == 1 && z10)) {
                            i11 = 1;
                        }
                        sb2.append(i11);
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
                lVar.addView(imageView, 0);
                return imageView;
            case 2:
                TextView textView2 = new TextView(lVar.getContext());
                org.telegram.ui.v50 v50Var = (org.telegram.ui.v50) obj;
                textView2.setTag(v50Var.a);
                TextView textView3 = new TextView(lVar.getContext());
                textView3.setTag(v50Var.b);
                ai.k0 k0Var = new ai.k0(lVar.getContext(), textView2, textView3);
                int i13 = org.telegram.ui.ActionBar.n6.G6;
                org.telegram.messenger.f3.l(textView2, i13, null, 1, 26.0f);
                textView2.setGravity(17);
                k0Var.addView(textView2, c8.ma.d(-1, -2.0f, 51, 18.0f, 244.0f, 18.0f, 0.0f));
                org.telegram.ui.ActionBar.u6.U(textView3, i13, null);
                textView3.setTextSize(1, 15.0f);
                textView3.setLineSpacing(org.telegram.messenger.g0.N(2.33f), 1.0f);
                textView3.setGravity(17);
                k0Var.addView(textView3, c8.ma.d(-1, -2.0f, 51, 16.0f, 286.0f, 16.0f, 0.0f));
                lVar.addView(k0Var, 0);
                textView2.setText(v50Var.G[i7]);
                textView3.setText(org.telegram.messenger.g0.W2(v50Var.H[i7]));
                return k0Var;
            case 3:
                org.telegram.ui.x71 x71Var = (org.telegram.ui.x71) obj;
                View view = i7 == 0 ? x71Var.v0 : x71Var.o0;
                lVar.addView(view);
                return view;
            default:
                ug.z0 z0Var = (ug.z0) obj;
                ug.y0 y0Var = new ug.y0(z0Var, z0Var.getContext(), i7);
                lVar.addView(y0Var);
                y0Var.a = i7;
                org.telegram.ui.ws0 ws0Var = (org.telegram.ui.ws0) z0Var.o1.get(i7);
                int i14 = ws0Var.a;
                String str = ws0Var.d;
                CharSequence charSequence = ws0Var.c;
                TextView textView4 = y0Var.b;
                k80 k80Var = y0Var.c;
                if (i14 == 0 || i14 == 14 || i14 == 28) {
                    textView4.setText("");
                    k80Var.setText("");
                    y0Var.h = true;
                } else if (z0Var.z1) {
                    int i15 = z0Var.y1;
                    if (i15 == 4) {
                        textView4.setText(org.telegram.messenger.gd.M0(2131754351, null));
                        k80Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131754350, null)));
                    } else if (i15 == 3) {
                        textView4.setText(org.telegram.messenger.gd.M0(2131746799, null));
                        k80Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131746797, null)));
                    } else if (i15 == 24) {
                        textView4.setText(org.telegram.messenger.gd.M0(2131746779, null));
                        k80Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131746777, null)));
                    } else if (i15 == 10) {
                        textView4.setText(org.telegram.messenger.gd.M0(2131746827, null));
                        k80Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131746825, null)));
                    } else if (i15 == 2) {
                        textView4.setText(org.telegram.messenger.gd.M0(2131746819, null));
                        k80Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131746817, null)));
                    } else if (i15 == 9) {
                        textView4.setText(org.telegram.messenger.gd.M0(2131746832, null));
                        k80Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131746830, null)));
                    } else if (i15 == 8) {
                        textView4.setText(org.telegram.messenger.gd.M0(2131746769, null));
                        k80Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131746767, null)));
                    } else if (i15 == 13) {
                        textView4.setText(org.telegram.messenger.gd.M0(2131746773, null));
                        k80Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131746772, null)));
                    } else if (i15 == 38) {
                        textView4.setText(org.telegram.messenger.gd.M0(2131746816, null));
                        k80Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131746815, null)));
                    } else if (i15 == 22) {
                        textView4.setText(org.telegram.messenger.gd.M0(2131746766, null));
                        k80Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131746765, null)));
                    } else if (i15 == 23) {
                        textView4.setText(org.telegram.messenger.gd.M0(2131746792, null));
                        k80Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131746791, null)));
                    } else if (i15 == 41) {
                        textView4.setText(org.telegram.messenger.gd.M0(2131746785, null));
                        k80Var.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131746784, null)));
                    } else {
                        textView4.setText(charSequence);
                        k80Var.setText(org.telegram.messenger.g0.W2(str));
                    }
                    y0Var.h = false;
                } else {
                    textView4.setText(charSequence);
                    k80Var.setText(org.telegram.messenger.g0.W2(str));
                    y0Var.h = false;
                }
                k80Var.setMaxWidth(hi.m3.a(k80Var.getText(), k80Var.getPaint()));
                y0Var.requestLayout();
                boolean z11 = ws0Var.a == 40;
                if (z11 && y0Var.d == null) {
                    LinearLayout linearLayout = new LinearLayout(y0Var.getContext());
                    y0Var.d = linearLayout;
                    linearLayout.setOrientation(1);
                    Context context = y0Var.getContext();
                    int i16 = ug.z0.J1;
                    ki.j jVar = new ki.j(context, z0Var.J0, true);
                    jVar.a(R.drawable.menu_feature_unique, org.telegram.messenger.gd.M0(2131749399, null), org.telegram.messenger.gd.M0(2131749400, null));
                    y0Var.d.addView(r2[0], c8.ma.o(-1, -2));
                    ki.j jVar2 = new ki.j(y0Var.getContext(), z0Var.J0, true);
                    jVar2.a(R.drawable.menu_feature_tradable, org.telegram.messenger.gd.M0(2131749397, null), org.telegram.messenger.gd.M0(2131749398, null));
                    y0Var.d.addView(r2[1], c8.ma.o(-1, -2));
                    ki.j jVar3 = new ki.j(y0Var.getContext(), z0Var.J0, true);
                    ki.j[] jVarArr = {jVar, jVar2, jVar3};
                    jVar3.a(R.drawable.menu_wear, org.telegram.messenger.gd.M0(2131749395, null), org.telegram.messenger.gd.M0(2131749396, null));
                    y0Var.d.addView(jVarArr[2], c8.ma.o(-1, -2));
                    y0Var.addView(y0Var.d, c8.ma.k(0.0f, -4.0f, 0.0f, 0.0f, -1, -2));
                }
                LinearLayout linearLayout2 = y0Var.d;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(z11 ? 0 : 8);
                }
                ((ViewGroup.MarginLayoutParams) k80Var.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(z11 ? 6.0f : 10.0f);
                return y0Var;
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
                org.telegram.ui.v50 v50Var = (org.telegram.ui.v50) this.d;
                v50Var.e.setCurrentPage(i7);
                v50Var.I = i7;
                break;
        }
    }

    private final void j(int i7) {
    }

    private final void k(int i7) {
    }
}
