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
import org.telegram.ui.t71;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class d20 extends c5.a {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d20(Object obj, int i7) {
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
                return ((org.telegram.ui.d30) this.d).p1.length;
            case 1:
                return ((org.telegram.ui.Components.voip.x0) this.d).f.length;
            case 2:
                return ((org.telegram.ui.t50) this.d).G.length;
            case 3:
                return ((t71) this.d).b != 0 ? 1 : 2;
            default:
                return ((ug.x0) this.d).o1.size();
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
    /* JADX WARN: Type inference failed for: r26v0, types: [android.view.View, android.view.ViewGroup, c5.l] */
    /* JADX WARN: Type inference failed for: r2v17, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    @Override // c5.a
    public final Object e(c5.l lVar, int i7) {
        ImageView imageView;
        int i10 = this.c;
        int i11 = 13;
        int i12 = 2;
        Bitmap bitmap = null;
        Object obj = this.d;
        switch (i10) {
            case 0:
                c20 c20Var = new c20(this, ((org.telegram.ui.d30) obj).getContext(), i7, r12);
                c20Var.setOnClickListener(new ci.q(this, i7, i11));
                c20Var.setFocusable(true);
                c20Var.setTag(Integer.valueOf(i7));
                c20Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
                c20Var.setScaleType(ImageView.ScaleType.FIT_XY);
                c20Var.setLayoutParams(new ViewGroup.LayoutParams(org.telegram.messenger.g0.L(200.0f), -1));
                if (i7 == 0) {
                    c20Var.setContentDescription(org.telegram.messenger.hd.M0(2131743252, null));
                } else if (i7 == 1) {
                    c20Var.setContentDescription(org.telegram.messenger.hd.M0(2131743250, null));
                } else {
                    c20Var.setContentDescription(org.telegram.messenger.hd.M0(2131743251, null));
                }
                org.telegram.messenger.pz i13 = org.telegram.messenger.qz.i(org.telegram.messenger.g0.y2(null, i7 == 0 ? R.raw.record_audio : i7 == 1 ? R.raw.record_video_p : R.raw.record_video_l));
                i13.s = false;
                c20Var.setImageDrawable(i13);
                if (c20Var.getParent() != null) {
                    ((ViewGroup) c20Var.getParent()).removeView(c20Var);
                }
                lVar.addView(c20Var, 0);
                return c20Var;
            case 1:
                org.telegram.ui.Components.voip.x0 x0Var = (org.telegram.ui.Components.voip.x0) obj;
                boolean z10 = x0Var.E;
                if (z10 && i7 == 0) {
                    ?? frameLayout = new FrameLayout(x0Var.getContext());
                    frameLayout.setBackground(new ra0(true, -14602694, -13935795, -14395293, -14203560));
                    ImageView imageView2 = new ImageView(x0Var.getContext());
                    imageView2.setScaleType(ImageView.ScaleType.CENTER);
                    imageView2.setImageResource(R.drawable.screencast_big);
                    frameLayout.addView(imageView2, c8.ja.d(82, 82.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
                    TextView textView = new TextView(x0Var.getContext());
                    textView.setText(org.telegram.messenger.hd.M0(2131743223, null));
                    textView.setGravity(17);
                    textView.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                    textView.setTextColor(-1);
                    textView.setTextSize(1, 15.0f);
                    textView.setTypeface(org.telegram.messenger.g0.o());
                    frameLayout.addView(textView, c8.ja.d(-1, -2.0f, 17, 21.0f, 28.0f, 21.0f, 0.0f));
                    imageView = frameLayout;
                } else {
                    ImageView imageView3 = new ImageView(x0Var.getContext());
                    imageView3.setTag(Integer.valueOf(i7));
                    try {
                        File h = org.telegram.messenger.t0.h();
                        StringBuilder sb2 = new StringBuilder("cthumb");
                        if (i7 == 0 || (i7 == 1 && z10)) {
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
                org.telegram.ui.t50 t50Var = (org.telegram.ui.t50) obj;
                textView2.setTag(t50Var.a);
                TextView textView3 = new TextView(lVar.getContext());
                textView3.setTag(t50Var.b);
                ai.k0 k0Var = new ai.k0(lVar.getContext(), textView2, textView3);
                int i14 = org.telegram.ui.ActionBar.j6.G6;
                org.telegram.messenger.k5.m(textView2, i14, null, 1, 26.0f);
                textView2.setGravity(17);
                k0Var.addView(textView2, c8.ja.d(-1, -2.0f, 51, 18.0f, 244.0f, 18.0f, 0.0f));
                org.telegram.ui.ActionBar.q6.U(textView3, i14, null);
                textView3.setTextSize(1, 15.0f);
                textView3.setLineSpacing(org.telegram.messenger.g0.N(2.33f), 1.0f);
                textView3.setGravity(17);
                k0Var.addView(textView3, c8.ja.d(-1, -2.0f, 51, 16.0f, 286.0f, 16.0f, 0.0f));
                lVar.addView(k0Var, 0);
                textView2.setText(t50Var.G[i7]);
                textView3.setText(org.telegram.messenger.g0.X2(t50Var.H[i7]));
                return k0Var;
            case 3:
                t71 t71Var = (t71) obj;
                View view = i7 == 0 ? t71Var.v0 : t71Var.o0;
                lVar.addView(view);
                return view;
            default:
                ug.x0 x0Var2 = (ug.x0) obj;
                ug.w0 w0Var = new ug.w0(x0Var2, x0Var2.getContext(), i7);
                lVar.addView(w0Var);
                w0Var.a = i7;
                org.telegram.ui.ss0 ss0Var = (org.telegram.ui.ss0) x0Var2.o1.get(i7);
                int i15 = ss0Var.a;
                String str = ss0Var.d;
                CharSequence charSequence = ss0Var.c;
                TextView textView4 = w0Var.b;
                z70 z70Var = w0Var.c;
                if (i15 == 0 || i15 == 14 || i15 == 28) {
                    textView4.setText("");
                    z70Var.setText("");
                    w0Var.h = true;
                } else if (x0Var2.z1) {
                    int i16 = x0Var2.y1;
                    if (i16 == 4) {
                        textView4.setText(org.telegram.messenger.hd.M0(2131754353, null));
                        z70Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131754352, null)));
                    } else if (i16 == 3) {
                        textView4.setText(org.telegram.messenger.hd.M0(2131746992, null));
                        z70Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131746990, null)));
                    } else if (i16 == 24) {
                        textView4.setText(org.telegram.messenger.hd.M0(2131746972, null));
                        z70Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131746970, null)));
                    } else if (i16 == 10) {
                        textView4.setText(org.telegram.messenger.hd.M0(2131747020, null));
                        z70Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131747018, null)));
                    } else if (i16 == 2) {
                        textView4.setText(org.telegram.messenger.hd.M0(2131747012, null));
                        z70Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131747010, null)));
                    } else if (i16 == 9) {
                        textView4.setText(org.telegram.messenger.hd.M0(2131747025, null));
                        z70Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131747023, null)));
                    } else if (i16 == 8) {
                        textView4.setText(org.telegram.messenger.hd.M0(2131746962, null));
                        z70Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131746960, null)));
                    } else if (i16 == 13) {
                        textView4.setText(org.telegram.messenger.hd.M0(2131746966, null));
                        z70Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131746965, null)));
                    } else if (i16 == 38) {
                        textView4.setText(org.telegram.messenger.hd.M0(2131747009, null));
                        z70Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131747008, null)));
                    } else if (i16 == 22) {
                        textView4.setText(org.telegram.messenger.hd.M0(2131746959, null));
                        z70Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131746958, null)));
                    } else if (i16 == 23) {
                        textView4.setText(org.telegram.messenger.hd.M0(2131746985, null));
                        z70Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131746984, null)));
                    } else if (i16 == 41) {
                        textView4.setText(org.telegram.messenger.hd.M0(2131746978, null));
                        z70Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131746977, null)));
                    } else {
                        textView4.setText(charSequence);
                        z70Var.setText(org.telegram.messenger.g0.X2(str));
                    }
                    w0Var.h = false;
                } else {
                    textView4.setText(charSequence);
                    z70Var.setText(org.telegram.messenger.g0.X2(str));
                    w0Var.h = false;
                }
                z70Var.setMaxWidth(hi.l3.a(z70Var.getText(), z70Var.getPaint()));
                w0Var.requestLayout();
                boolean z11 = ss0Var.a == 40;
                if (z11 && w0Var.d == null) {
                    LinearLayout linearLayout = new LinearLayout(w0Var.getContext());
                    w0Var.d = linearLayout;
                    linearLayout.setOrientation(1);
                    Context context = w0Var.getContext();
                    int i17 = ug.x0.J1;
                    ki.j jVar = new ki.j(context, x0Var2.J0, true);
                    jVar.a(R.drawable.menu_feature_unique, org.telegram.messenger.hd.M0(2131749574, null), org.telegram.messenger.hd.M0(2131749575, null));
                    w0Var.d.addView(r2[0], c8.ja.o(-1, -2));
                    ki.j jVar2 = new ki.j(w0Var.getContext(), x0Var2.J0, true);
                    jVar2.a(R.drawable.menu_feature_tradable, org.telegram.messenger.hd.M0(2131749572, null), org.telegram.messenger.hd.M0(2131749573, null));
                    w0Var.d.addView(r2[1], c8.ja.o(-1, -2));
                    ki.j jVar3 = new ki.j(w0Var.getContext(), x0Var2.J0, true);
                    ki.j[] jVarArr = {jVar, jVar2, jVar3};
                    jVar3.a(R.drawable.menu_wear, org.telegram.messenger.hd.M0(2131749570, null), org.telegram.messenger.hd.M0(2131749571, null));
                    w0Var.d.addView(jVarArr[2], c8.ja.o(-1, -2));
                    w0Var.addView(w0Var.d, c8.ja.k(0.0f, -4.0f, 0.0f, 0.0f, -1, -2));
                }
                LinearLayout linearLayout2 = w0Var.d;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(z11 ? 0 : 8);
                }
                ((ViewGroup.MarginLayoutParams) z70Var.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(z11 ? 6.0f : 10.0f);
                return w0Var;
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
                org.telegram.ui.t50 t50Var = (org.telegram.ui.t50) this.d;
                t50Var.e.setCurrentPage(i7);
                t50Var.I = i7;
                break;
        }
    }

    private final void j(int i7) {
    }

    private final void k(int i7) {
    }
}
