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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class f95 extends pr7 {
    public final /* synthetic */ byte c;
    public final /* synthetic */ Object d;

    public /* synthetic */ f95(Object obj, byte b) {
        this.c = b;
        this.d = obj;
    }

    @Override // pr7
    public final void a(gec gecVar, Object obj) {
        switch (this.c) {
            case 0:
                gecVar.removeView((View) obj);
                break;
            case 1:
                gecVar.removeView((View) obj);
                break;
            case 2:
                gecVar.removeView((View) obj);
                break;
            case 3:
                gecVar.removeView((View) obj);
                break;
            default:
                gecVar.removeView((View) obj);
                break;
        }
    }

    @Override // pr7
    public final int b() {
        byte b = this.c;
        Object obj = this.d;
        switch (b) {
            case 0:
                return ((f65) obj).o1.length;
            case 1:
                return ((wp5) obj).G.length;
            case 2:
                return ((jh8) obj).n1.size();
            case 3:
                return ((mk8) obj).f.length;
            default:
                return ((qmb) obj).b != 0 ? 1 : 2;
        }
    }

    @Override // pr7
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
    /* JADX WARN: Type inference failed for: r22v0, types: [android.view.View, android.view.ViewGroup, gec] */
    @Override // pr7
    public final Object e(gec gecVar, int i) {
        ImageView imageView;
        byte b = this.c;
        int i2 = 2;
        Bitmap bitmap = null;
        byte b2 = 1;
        Object obj = this.d;
        switch (b) {
            case 0:
                ef4 ef4Var = new ef4(this, ((f65) obj).getContext(), i, b2);
                ef4Var.setOnClickListener(new v0(this, i, r4));
                ef4Var.setFocusable(true);
                ef4Var.setTag(Integer.valueOf(i));
                ef4Var.setPadding(gl.L(18.0f), 0, gl.L(18.0f), 0);
                ef4Var.setScaleType(ImageView.ScaleType.FIT_XY);
                ef4Var.setLayoutParams(new ViewGroup.LayoutParams(gl.L(200.0f), -1));
                if (i == 0) {
                    ef4Var.setContentDescription(k96.M0(2131743010, null));
                } else if (i == 1) {
                    ef4Var.setContentDescription(k96.M0(2131743008, null));
                } else {
                    ef4Var.setContentDescription(k96.M0(2131743009, null));
                }
                kcb h = lcb.h(gl.v2(null, i == 0 ? R.raw.record_audio : i == 1 ? R.raw.record_video_p : R.raw.record_video_l));
                h.s = false;
                ef4Var.setImageDrawable(h);
                if (ef4Var.getParent() != null) {
                    ((ViewGroup) ef4Var.getParent()).removeView(ef4Var);
                }
                gecVar.addView(ef4Var, 0);
                return ef4Var;
            case 1:
                TextView textView = new TextView(gecVar.getContext());
                wp5 wp5Var = (wp5) obj;
                textView.setTag(wp5Var.a);
                TextView textView2 = new TextView(gecVar.getContext());
                textView2.setTag(wp5Var.b);
                st stVar = new st(gecVar.getContext(), textView, textView2);
                int i3 = bkb.F6;
                tb4.w(textView, i3, null, 1, 26.0f);
                textView.setGravity(17);
                stVar.addView(textView, nme.d(-1, -2.0f, 51, 18.0f, 244.0f, 18.0f, 0.0f));
                zkb.X(textView2, i3, null);
                textView2.setTextSize(1, 15.0f);
                textView2.setLineSpacing(gl.N(2.33f), 1.0f);
                textView2.setGravity(17);
                stVar.addView(textView2, nme.d(-1, -2.0f, 51, 16.0f, 286.0f, 16.0f, 0.0f));
                gecVar.addView(stVar, 0);
                textView.setText(wp5Var.G[i]);
                textView2.setText(gl.S2(wp5Var.H[i]));
                return stVar;
            case 2:
                jh8 jh8Var = (jh8) obj;
                ih8 ih8Var = new ih8(jh8Var, jh8Var.getContext(), i);
                gecVar.addView(ih8Var);
                ih8Var.a = i;
                fi8 fi8Var = (fi8) jh8Var.n1.get(i);
                byte b3 = fi8Var.a;
                String str = fi8Var.d;
                String str2 = fi8Var.c;
                TextView textView3 = ih8Var.b;
                l46 l46Var = ih8Var.c;
                if (b3 == 0 || b3 == 14 || b3 == 28) {
                    textView3.setText("");
                    l46Var.setText("");
                    ih8Var.h = true;
                } else if (jh8Var.y1) {
                    byte b4 = jh8Var.x1;
                    if (b4 == 4) {
                        textView3.setText(k96.M0(2131754350, null));
                        l46Var.setText(gl.S2(k96.M0(2131754349, null)));
                    } else if (b4 == 3) {
                        textView3.setText(k96.M0(2131746801, null));
                        l46Var.setText(gl.S2(k96.M0(2131746799, null)));
                    } else if (b4 == 24) {
                        textView3.setText(k96.M0(2131746781, null));
                        l46Var.setText(gl.S2(k96.M0(2131746779, null)));
                    } else if (b4 == 10) {
                        textView3.setText(k96.M0(2131746829, null));
                        l46Var.setText(gl.S2(k96.M0(2131746827, null)));
                    } else if (b4 == 2) {
                        textView3.setText(k96.M0(2131746821, null));
                        l46Var.setText(gl.S2(k96.M0(2131746819, null)));
                    } else if (b4 == 9) {
                        textView3.setText(k96.M0(2131746834, null));
                        l46Var.setText(gl.S2(k96.M0(2131746832, null)));
                    } else if (b4 == 8) {
                        textView3.setText(k96.M0(2131746771, null));
                        l46Var.setText(gl.S2(k96.M0(2131746769, null)));
                    } else if (b4 == 13) {
                        textView3.setText(k96.M0(2131746775, null));
                        l46Var.setText(gl.S2(k96.M0(2131746774, null)));
                    } else if (b4 == 38) {
                        textView3.setText(k96.M0(2131746818, null));
                        l46Var.setText(gl.S2(k96.M0(2131746817, null)));
                    } else if (b4 == 22) {
                        textView3.setText(k96.M0(2131746768, null));
                        l46Var.setText(gl.S2(k96.M0(2131746767, null)));
                    } else if (b4 == 23) {
                        textView3.setText(k96.M0(2131746794, null));
                        l46Var.setText(gl.S2(k96.M0(2131746793, null)));
                    } else if (b4 == 41) {
                        textView3.setText(k96.M0(2131746787, null));
                        l46Var.setText(gl.S2(k96.M0(2131746786, null)));
                    } else {
                        textView3.setText(str2);
                        l46Var.setText(gl.S2(str));
                    }
                    ih8Var.h = false;
                } else {
                    textView3.setText(str2);
                    l46Var.setText(gl.S2(str));
                    ih8Var.h = false;
                }
                l46Var.setMaxWidth(je5.a(l46Var.getText(), l46Var.getPaint()));
                ih8Var.requestLayout();
                boolean z = fi8Var.a == 40;
                if (z && ih8Var.d == null) {
                    LinearLayout linearLayout = new LinearLayout(ih8Var.getContext());
                    ih8Var.d = linearLayout;
                    linearLayout.setOrientation(1);
                    Context context = ih8Var.getContext();
                    int i4 = jh8.I1;
                    ac acVar = new ac(jh8Var.J0, context, true);
                    acVar.a(R.drawable.menu_feature_unique, k96.M0(2131749399, null), k96.M0(2131749400, null));
                    ih8Var.d.addView(r2[0], nme.o(-1, -2));
                    ac acVar2 = new ac(jh8Var.J0, ih8Var.getContext(), true);
                    acVar2.a(R.drawable.menu_feature_tradable, k96.M0(2131749397, null), k96.M0(2131749398, null));
                    ih8Var.d.addView(r2[1], nme.o(-1, -2));
                    ac acVar3 = new ac(jh8Var.J0, ih8Var.getContext(), true);
                    ac[] acVarArr = {acVar, acVar2, acVar3};
                    acVar3.a(R.drawable.menu_wear, k96.M0(2131749395, null), k96.M0(2131749396, null));
                    ih8Var.d.addView(acVarArr[2], nme.o(-1, -2));
                    ih8Var.addView(ih8Var.d, nme.k(0.0f, -4.0f, 0.0f, 0.0f, -1, -2));
                }
                LinearLayout linearLayout2 = ih8Var.d;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(z ? (byte) 0 : (byte) 8);
                }
                ((ViewGroup.MarginLayoutParams) l46Var.getLayoutParams()).topMargin = gl.L(z ? 6.0f : 10.0f);
                return ih8Var;
            case 3:
                mk8 mk8Var = (mk8) obj;
                boolean z2 = mk8Var.E;
                if (z2 && i == 0) {
                    ?? frameLayout = new FrameLayout(mk8Var.getContext());
                    frameLayout.setBackground(new ye7(-14602694, -13935795, -14395293, -14203560, true, false));
                    ImageView imageView2 = new ImageView(mk8Var.getContext());
                    imageView2.setScaleType(ImageView.ScaleType.CENTER);
                    imageView2.setImageResource(R.drawable.screencast_big);
                    frameLayout.addView(imageView2, nme.d(82, 82.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
                    TextView textView4 = new TextView(mk8Var.getContext());
                    textView4.setText(k96.M0(2131742981, null));
                    textView4.setGravity(17);
                    textView4.setLineSpacing(gl.L(2.0f), 1.0f);
                    textView4.setTextColor(-1);
                    textView4.setTextSize(1, 15.0f);
                    textView4.setTypeface(gl.o());
                    frameLayout.addView(textView4, nme.d(-1, -2.0f, 17, 21.0f, 28.0f, 21.0f, 0.0f));
                    imageView = frameLayout;
                } else {
                    ImageView imageView3 = new ImageView(mk8Var.getContext());
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
                gecVar.addView(imageView, 0);
                return imageView;
            default:
                qmb qmbVar = (qmb) obj;
                View view = i == 0 ? qmbVar.v0 : qmbVar.o0;
                gecVar.addView(view);
                return view;
        }
    }

    @Override // pr7
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

    @Override // pr7
    public final void h(int i) {
        switch (this.c) {
            case 1:
                wp5 wp5Var = (wp5) this.d;
                wp5Var.e.setCurrentPage(i);
                wp5Var.I = i;
                break;
        }
    }

    private final void j(int i) {
    }

    private final void k(int i) {
    }
}
