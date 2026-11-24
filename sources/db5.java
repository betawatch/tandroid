// default package

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
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class db5 extends qt7 {
    public final /* synthetic */ byte c;
    public final /* synthetic */ Object d;

    public /* synthetic */ db5(Object obj, byte b) {
        this.c = b;
        this.d = obj;
    }

    @Override // qt7
    public final void a(ggc ggcVar, Object obj) {
        switch (this.c) {
            case 0:
                ggcVar.removeView((View) obj);
                break;
            case 1:
                ggcVar.removeView((View) obj);
                break;
            case 2:
                ggcVar.removeView((View) obj);
                break;
            case 3:
                ggcVar.removeView((View) obj);
                break;
            default:
                ggcVar.removeView((View) obj);
                break;
        }
    }

    @Override // qt7
    public final int b() {
        byte b = this.c;
        Object obj = this.d;
        switch (b) {
            case 0:
                return ((d85) obj).o1.length;
            case 1:
                return ((vr5) obj).G.length;
            case 2:
                return ((kj8) obj).n1.size();
            case 3:
                return ((om8) obj).f.length;
            default:
                return ((rob) obj).b != 0 ? 1 : 2;
        }
    }

    @Override // qt7
    public final int c(Object obj) {
        switch (this.c) {
            case 4:
                return -1;
            default:
                return super.c(obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v34, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r22v0, types: [android.view.View, android.view.ViewGroup, ggc] */
    @Override // qt7
    public final Object e(ggc ggcVar, int i) {
        ImageView imageView;
        byte b = this.c;
        int i2 = 2;
        Bitmap bitmap = null;
        byte b2 = 1;
        Object obj = this.d;
        switch (b) {
            case 0:
                gh4 gh4Var = new gh4(this, ((d85) obj).getContext(), i, b2);
                gh4Var.setOnClickListener(new v0(this, i, r4));
                gh4Var.setFocusable(true);
                gh4Var.setTag(Integer.valueOf(i));
                gh4Var.setPadding(gm.L(18.0f), 0, gm.L(18.0f), 0);
                gh4Var.setScaleType(ImageView.ScaleType.FIT_XY);
                gh4Var.setLayoutParams(new ViewGroup.LayoutParams(gm.L(200.0f), -1));
                if (i == 0) {
                    gh4Var.setContentDescription(jb6.M0(2131742936, null));
                } else if (i == 1) {
                    gh4Var.setContentDescription(jb6.M0(2131742934, null));
                } else {
                    gh4Var.setContentDescription(jb6.M0(2131742935, null));
                }
                meb h = neb.h(gm.v2(null, i == 0 ? R.raw.record_audio : i == 1 ? R.raw.record_video_p : R.raw.record_video_l));
                h.s = false;
                gh4Var.setImageDrawable(h);
                if (gh4Var.getParent() != null) {
                    ((ViewGroup) gh4Var.getParent()).removeView(gh4Var);
                }
                ggcVar.addView(gh4Var, 0);
                return gh4Var;
            case 1:
                TextView textView = new TextView(ggcVar.getContext());
                vr5 vr5Var = (vr5) obj;
                textView.setTag(vr5Var.a);
                TextView textView2 = new TextView(ggcVar.getContext());
                textView2.setTag(vr5Var.b);
                su suVar = new su(ggcVar.getContext(), textView, textView2);
                int i3 = cmb.F6;
                td4.x(textView, i3, null, 1, 26.0f);
                textView.setGravity(17);
                suVar.addView(textView, qoe.d(-1, -2.0f, 51, 18.0f, 244.0f, 18.0f, 0.0f));
                anb.X(textView2, i3, null);
                textView2.setTextSize(1, 15.0f);
                textView2.setLineSpacing(gm.N(2.33f), 1.0f);
                textView2.setGravity(17);
                suVar.addView(textView2, qoe.d(-1, -2.0f, 51, 16.0f, 286.0f, 16.0f, 0.0f));
                ggcVar.addView(suVar, 0);
                textView.setText(vr5Var.G[i]);
                textView2.setText(gm.S2(vr5Var.H[i]));
                return suVar;
            case 2:
                kj8 kj8Var = (kj8) obj;
                jj8 jj8Var = new jj8(kj8Var, kj8Var.getContext(), i);
                ggcVar.addView(jj8Var);
                jj8Var.a = i;
                hk8 hk8Var = (hk8) kj8Var.n1.get(i);
                byte b3 = hk8Var.a;
                String str = hk8Var.d;
                String str2 = hk8Var.c;
                TextView textView3 = jj8Var.b;
                l66 l66Var = jj8Var.c;
                if (b3 == 0 || b3 == 14 || b3 == 28) {
                    textView3.setText("");
                    l66Var.setText("");
                    jj8Var.h = true;
                } else if (kj8Var.y1) {
                    byte b4 = kj8Var.x1;
                    if (b4 == 4) {
                        textView3.setText(jb6.M0(2131754350, null));
                        l66Var.setText(gm.S2(jb6.M0(2131754349, null)));
                    } else if (b4 == 3) {
                        textView3.setText(jb6.M0(2131746727, null));
                        l66Var.setText(gm.S2(jb6.M0(2131746725, null)));
                    } else if (b4 == 24) {
                        textView3.setText(jb6.M0(2131746707, null));
                        l66Var.setText(gm.S2(jb6.M0(2131746705, null)));
                    } else if (b4 == 10) {
                        textView3.setText(jb6.M0(2131746755, null));
                        l66Var.setText(gm.S2(jb6.M0(2131746753, null)));
                    } else if (b4 == 2) {
                        textView3.setText(jb6.M0(2131746747, null));
                        l66Var.setText(gm.S2(jb6.M0(2131746745, null)));
                    } else if (b4 == 9) {
                        textView3.setText(jb6.M0(2131746760, null));
                        l66Var.setText(gm.S2(jb6.M0(2131746758, null)));
                    } else if (b4 == 8) {
                        textView3.setText(jb6.M0(2131746697, null));
                        l66Var.setText(gm.S2(jb6.M0(2131746695, null)));
                    } else if (b4 == 13) {
                        textView3.setText(jb6.M0(2131746701, null));
                        l66Var.setText(gm.S2(jb6.M0(2131746700, null)));
                    } else if (b4 == 38) {
                        textView3.setText(jb6.M0(2131746744, null));
                        l66Var.setText(gm.S2(jb6.M0(2131746743, null)));
                    } else if (b4 == 22) {
                        textView3.setText(jb6.M0(2131746694, null));
                        l66Var.setText(gm.S2(jb6.M0(2131746693, null)));
                    } else if (b4 == 23) {
                        textView3.setText(jb6.M0(2131746720, null));
                        l66Var.setText(gm.S2(jb6.M0(2131746719, null)));
                    } else if (b4 == 41) {
                        textView3.setText(jb6.M0(2131746713, null));
                        l66Var.setText(gm.S2(jb6.M0(2131746712, null)));
                    } else {
                        textView3.setText(str2);
                        l66Var.setText(gm.S2(str));
                    }
                    jj8Var.h = false;
                } else {
                    textView3.setText(str2);
                    l66Var.setText(gm.S2(str));
                    jj8Var.h = false;
                }
                l66Var.setMaxWidth(hg5.a(l66Var.getText(), l66Var.getPaint()));
                jj8Var.requestLayout();
                boolean z = hk8Var.a == 40;
                if (z && jj8Var.d == null) {
                    LinearLayout linearLayout = new LinearLayout(jj8Var.getContext());
                    jj8Var.d = linearLayout;
                    linearLayout.setOrientation(1);
                    Context context = jj8Var.getContext();
                    int i4 = kj8.I1;
                    ac acVar = new ac(kj8Var.J0, context, true);
                    acVar.a(R.drawable.menu_feature_unique, jb6.M0(2131749348, null), jb6.M0(2131749349, null));
                    jj8Var.d.addView(r2[0], qoe.o(-1, -2));
                    ac acVar2 = new ac(kj8Var.J0, jj8Var.getContext(), true);
                    acVar2.a(R.drawable.menu_feature_tradable, jb6.M0(2131749346, null), jb6.M0(2131749347, null));
                    jj8Var.d.addView(r2[1], qoe.o(-1, -2));
                    ac acVar3 = new ac(kj8Var.J0, jj8Var.getContext(), true);
                    ac[] acVarArr = {acVar, acVar2, acVar3};
                    acVar3.a(R.drawable.menu_wear, jb6.M0(2131749344, null), jb6.M0(2131749345, null));
                    jj8Var.d.addView(acVarArr[2], qoe.o(-1, -2));
                    jj8Var.addView(jj8Var.d, qoe.k(0.0f, -4.0f, 0.0f, 0.0f, -1, -2));
                }
                LinearLayout linearLayout2 = jj8Var.d;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(z ? (byte) 0 : (byte) 8);
                }
                ((ViewGroup.MarginLayoutParams) l66Var.getLayoutParams()).topMargin = gm.L(z ? 6.0f : 10.0f);
                return jj8Var;
            case 3:
                om8 om8Var = (om8) obj;
                boolean z2 = om8Var.E;
                if (z2 && i == 0) {
                    ?? frameLayout = new FrameLayout(om8Var.getContext());
                    frameLayout.setBackground(new ah7(-14602694, -13935795, -14395293, -14203560, true, false));
                    ImageView imageView2 = new ImageView(om8Var.getContext());
                    imageView2.setScaleType(ImageView.ScaleType.CENTER);
                    imageView2.setImageResource(R.drawable.screencast_big);
                    frameLayout.addView(imageView2, qoe.d(82, 82.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
                    TextView textView4 = new TextView(om8Var.getContext());
                    textView4.setText(jb6.M0(2131742907, null));
                    textView4.setGravity(17);
                    textView4.setLineSpacing(gm.L(2.0f), 1.0f);
                    textView4.setTextColor(-1);
                    textView4.setTextSize(1, 15.0f);
                    textView4.setTypeface(gm.o());
                    frameLayout.addView(textView4, qoe.d(-1, -2.0f, 17, 21.0f, 28.0f, 21.0f, 0.0f));
                    imageView = frameLayout;
                } else {
                    ImageView imageView3 = new ImageView(om8Var.getContext());
                    imageView3.setTag(Integer.valueOf(i));
                    try {
                        File h2 = a.h();
                        StringBuilder sb = new StringBuilder("cthumb");
                        if (i == 0 || (i == 1 && z2)) {
                            i2 = 1;
                        }
                        sb.append(i2);
                        sb.append(".jpg");
                        bitmap = BitmapFactory.decodeFile(new File(h2, sb.toString()).getAbsolutePath());
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
                ggcVar.addView(imageView, 0);
                return imageView;
            default:
                rob robVar = (rob) obj;
                View view = i == 0 ? robVar.v0 : robVar.o0;
                ggcVar.addView(view);
                return view;
        }
    }

    @Override // qt7
    public final boolean f(View view, Object obj) {
        switch (this.c) {
            case 0:
                return view.equals(obj);
            case 1:
                return view.equals(obj);
            case 2:
                return view == obj;
            case 3:
                return view.equals(obj);
            default:
                return obj == view;
        }
    }

    @Override // qt7
    public final void h(int i) {
        switch (this.c) {
            case 1:
                vr5 vr5Var = (vr5) this.d;
                vr5Var.e.setCurrentPage(i);
                vr5Var.I = i;
                break;
        }
    }

    private final void j(int i) {
    }

    private final void k(int i) {
    }
}
