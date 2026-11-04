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
import org.telegram.ui.l71;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class w10 extends b5.a {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ w10(Object obj, int i3) {
        this.c = i3;
        this.d = obj;
    }

    @Override // b5.a
    public final void a(b5.l lVar, Object obj) {
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

    @Override // b5.a
    public final int b() {
        switch (this.c) {
            case 0:
                return ((org.telegram.ui.x20) this.d).m1.length;
            case 1:
                return ((org.telegram.ui.Components.voip.f0) this.d).f.length;
            case 2:
                return ((org.telegram.ui.o50) this.d).G.length;
            case 3:
                return ((l71) this.d).b != 0 ? 1 : 2;
            default:
                return ((vg.v0) this.d).l1.size();
        }
    }

    @Override // b5.a
    public int c(Object obj) {
        switch (this.c) {
            case 3:
                return -1;
            default:
                return super.c(obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r26v0, types: [android.view.View, android.view.ViewGroup, b5.l] */
    /* JADX WARN: Type inference failed for: r2v17, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    @Override // b5.a
    public final Object e(b5.l lVar, int i3) {
        ImageView imageView;
        int i10 = this.c;
        int i11 = 13;
        int i12 = 2;
        Bitmap bitmap = null;
        Object obj = this.d;
        switch (i10) {
            case 0:
                v10 v10Var = new v10(this, ((org.telegram.ui.x20) obj).getContext(), i3, r12);
                v10Var.setOnClickListener(new bi.q(this, i3, i11));
                v10Var.setFocusable(true);
                v10Var.setTag(Integer.valueOf(i3));
                v10Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
                v10Var.setScaleType(ImageView.ScaleType.FIT_XY);
                v10Var.setLayoutParams(new ViewGroup.LayoutParams(org.telegram.messenger.g0.L(200.0f), -1));
                if (i3 == 0) {
                    v10Var.setContentDescription(org.telegram.messenger.bd.M0(2131743262, null));
                } else if (i3 == 1) {
                    v10Var.setContentDescription(org.telegram.messenger.bd.M0(2131743260, null));
                } else {
                    v10Var.setContentDescription(org.telegram.messenger.bd.M0(2131743261, null));
                }
                org.telegram.messenger.jz i13 = org.telegram.messenger.kz.i(org.telegram.messenger.g0.y2(null, i3 == 0 ? R.raw.record_audio : i3 == 1 ? R.raw.record_video_p : R.raw.record_video_l));
                i13.s = false;
                v10Var.setImageDrawable(i13);
                if (v10Var.getParent() != null) {
                    ((ViewGroup) v10Var.getParent()).removeView(v10Var);
                }
                lVar.addView(v10Var, 0);
                return v10Var;
            case 1:
                org.telegram.ui.Components.voip.f0 f0Var = (org.telegram.ui.Components.voip.f0) obj;
                boolean z10 = f0Var.E;
                if (z10 && i3 == 0) {
                    ?? frameLayout = new FrameLayout(f0Var.getContext());
                    frameLayout.setBackground(new la0(true, -14602694, -13935795, -14395293, -14203560));
                    ImageView imageView2 = new ImageView(f0Var.getContext());
                    imageView2.setScaleType(ImageView.ScaleType.CENTER);
                    imageView2.setImageResource(R.drawable.screencast_big);
                    frameLayout.addView(imageView2, b8.mf.d(82, 82.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
                    TextView textView = new TextView(f0Var.getContext());
                    textView.setText(org.telegram.messenger.bd.M0(2131743233, null));
                    textView.setGravity(17);
                    textView.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                    textView.setTextColor(-1);
                    textView.setTextSize(1, 15.0f);
                    textView.setTypeface(org.telegram.messenger.g0.o());
                    frameLayout.addView(textView, b8.mf.d(-1, -2.0f, 17, 21.0f, 28.0f, 21.0f, 0.0f));
                    imageView = frameLayout;
                } else {
                    ImageView imageView3 = new ImageView(f0Var.getContext());
                    imageView3.setTag(Integer.valueOf(i3));
                    try {
                        File h = org.telegram.messenger.t0.h();
                        StringBuilder sb2 = new StringBuilder("cthumb");
                        if (i3 == 0 || (i3 == 1 && z10)) {
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
                lVar.addView(imageView, 0);
                return imageView;
            case 2:
                TextView textView2 = new TextView(lVar.getContext());
                org.telegram.ui.o50 o50Var = (org.telegram.ui.o50) obj;
                textView2.setTag(o50Var.a);
                TextView textView3 = new TextView(lVar.getContext());
                textView3.setTag(o50Var.b);
                ai.c0 c0Var = new ai.c0(lVar.getContext(), textView2, textView3);
                int i14 = org.telegram.ui.ActionBar.k6.G6;
                org.telegram.messenger.k5.n(textView2, i14, null, 1, 26.0f);
                textView2.setGravity(17);
                c0Var.addView(textView2, b8.mf.d(-1, -2.0f, 51, 18.0f, 244.0f, 18.0f, 0.0f));
                org.telegram.ui.ActionBar.r6.V(textView3, i14, null);
                textView3.setTextSize(1, 15.0f);
                textView3.setLineSpacing(org.telegram.messenger.g0.N(2.33f), 1.0f);
                textView3.setGravity(17);
                c0Var.addView(textView3, b8.mf.d(-1, -2.0f, 51, 16.0f, 286.0f, 16.0f, 0.0f));
                lVar.addView(c0Var, 0);
                textView2.setText(o50Var.G[i3]);
                textView3.setText(org.telegram.messenger.g0.X2(o50Var.H[i3]));
                return c0Var;
            case 3:
                l71 l71Var = (l71) obj;
                View view = i3 == 0 ? l71Var.v0 : l71Var.o0;
                lVar.addView(view);
                return view;
            default:
                vg.v0 v0Var = (vg.v0) obj;
                vg.u0 u0Var = new vg.u0(v0Var, v0Var.getContext(), i3);
                lVar.addView(u0Var);
                u0Var.a = i3;
                org.telegram.ui.ls0 ls0Var = (org.telegram.ui.ls0) v0Var.l1.get(i3);
                int i15 = ls0Var.a;
                String str = ls0Var.d;
                CharSequence charSequence = ls0Var.c;
                TextView textView4 = u0Var.b;
                s70 s70Var = u0Var.c;
                if (i15 == 0 || i15 == 14 || i15 == 28) {
                    textView4.setText("");
                    s70Var.setText("");
                    u0Var.h = true;
                } else if (v0Var.w1) {
                    int i16 = v0Var.v1;
                    if (i16 == 4) {
                        textView4.setText(org.telegram.messenger.bd.M0(2131754353, null));
                        s70Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131754352, null)));
                    } else if (i16 == 3) {
                        textView4.setText(org.telegram.messenger.bd.M0(2131747000, null));
                        s70Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131746998, null)));
                    } else if (i16 == 24) {
                        textView4.setText(org.telegram.messenger.bd.M0(2131746980, null));
                        s70Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131746978, null)));
                    } else if (i16 == 10) {
                        textView4.setText(org.telegram.messenger.bd.M0(2131747028, null));
                        s70Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131747026, null)));
                    } else if (i16 == 2) {
                        textView4.setText(org.telegram.messenger.bd.M0(2131747020, null));
                        s70Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131747018, null)));
                    } else if (i16 == 9) {
                        textView4.setText(org.telegram.messenger.bd.M0(2131747033, null));
                        s70Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131747031, null)));
                    } else if (i16 == 8) {
                        textView4.setText(org.telegram.messenger.bd.M0(2131746970, null));
                        s70Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131746968, null)));
                    } else if (i16 == 13) {
                        textView4.setText(org.telegram.messenger.bd.M0(2131746974, null));
                        s70Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131746973, null)));
                    } else if (i16 == 38) {
                        textView4.setText(org.telegram.messenger.bd.M0(2131747017, null));
                        s70Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131747016, null)));
                    } else if (i16 == 22) {
                        textView4.setText(org.telegram.messenger.bd.M0(2131746967, null));
                        s70Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131746966, null)));
                    } else if (i16 == 23) {
                        textView4.setText(org.telegram.messenger.bd.M0(2131746993, null));
                        s70Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131746992, null)));
                    } else if (i16 == 41) {
                        textView4.setText(org.telegram.messenger.bd.M0(2131746986, null));
                        s70Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131746985, null)));
                    } else {
                        textView4.setText(charSequence);
                        s70Var.setText(org.telegram.messenger.g0.X2(str));
                    }
                    u0Var.h = false;
                } else {
                    textView4.setText(charSequence);
                    s70Var.setText(org.telegram.messenger.g0.X2(str));
                    u0Var.h = false;
                }
                s70Var.setMaxWidth(gi.l3.a(s70Var.getText(), s70Var.getPaint()));
                u0Var.requestLayout();
                boolean z11 = ls0Var.a == 40;
                if (z11 && u0Var.d == null) {
                    LinearLayout linearLayout = new LinearLayout(u0Var.getContext());
                    u0Var.d = linearLayout;
                    linearLayout.setOrientation(1);
                    Context context = u0Var.getContext();
                    int i17 = vg.v0.G1;
                    ii.j jVar = new ii.j(context, v0Var.J0, true);
                    jVar.a(R.drawable.menu_feature_unique, org.telegram.messenger.bd.M0(2131749582, null), org.telegram.messenger.bd.M0(2131749583, null));
                    u0Var.d.addView(r2[0], b8.mf.o(-1, -2));
                    ii.j jVar2 = new ii.j(u0Var.getContext(), v0Var.J0, true);
                    jVar2.a(R.drawable.menu_feature_tradable, org.telegram.messenger.bd.M0(2131749580, null), org.telegram.messenger.bd.M0(2131749581, null));
                    u0Var.d.addView(r2[1], b8.mf.o(-1, -2));
                    ii.j jVar3 = new ii.j(u0Var.getContext(), v0Var.J0, true);
                    ii.j[] jVarArr = {jVar, jVar2, jVar3};
                    jVar3.a(R.drawable.menu_wear, org.telegram.messenger.bd.M0(2131749578, null), org.telegram.messenger.bd.M0(2131749579, null));
                    u0Var.d.addView(jVarArr[2], b8.mf.o(-1, -2));
                    u0Var.addView(u0Var.d, b8.mf.k(0.0f, -4.0f, 0.0f, 0.0f, -1, -2));
                }
                LinearLayout linearLayout2 = u0Var.d;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(z11 ? 0 : 8);
                }
                ((ViewGroup.MarginLayoutParams) s70Var.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(z11 ? 6.0f : 10.0f);
                return u0Var;
        }
    }

    @Override // b5.a
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

    @Override // b5.a
    public void h(int i3) {
        switch (this.c) {
            case 2:
                org.telegram.ui.o50 o50Var = (org.telegram.ui.o50) this.d;
                o50Var.e.setCurrentPage(i3);
                o50Var.I = i3;
                break;
        }
    }

    private final void j(int i3) {
    }

    private final void k(int i3) {
    }
}
