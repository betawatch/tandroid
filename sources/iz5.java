// default package

import android.content.Context;
import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.LanguageSelectActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class iz5 extends q59 {
    public final /* synthetic */ byte c;
    public final Context d;
    public final boolean e;
    public final /* synthetic */ d f;

    public /* synthetic */ iz5(d dVar, Context context, boolean z, byte b) {
        this.c = b;
        this.f = dVar;
        this.d = context;
        this.e = z;
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        switch (this.c) {
            case 0:
                int i = u69Var.f;
                if (i == 0 || i == 4 || i == 5 || i == 2) {
                    break;
                }
                break;
            default:
                if (u69Var.f == 0) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // y59
    public final int b() {
        int i;
        byte b = this.c;
        d dVar = this.f;
        boolean z = this.e;
        switch (b) {
            case 0:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) dVar;
                if (z) {
                    ArrayList arrayList = languageSelectActivity.e;
                    if (arrayList != null) {
                        return arrayList.size();
                    }
                    return 0;
                }
                if (languageSelectActivity.getMessagesController().J2() || languageSelectActivity.getMessagesController().I2()) {
                    int i2 = languageSelectActivity.getMessagesController().J2() ? 3 : 2;
                    if (languageSelectActivity.getMessagesController().I2() && !languageSelectActivity.getMessagesController().H3()) {
                        i2++;
                    }
                    if (languageSelectActivity.f0() || languageSelectActivity.g0()) {
                        i2++;
                    }
                    i = i2 + 1;
                } else {
                    i = 1;
                }
                int size = languageSelectActivity.f.size() + i + 1;
                return !languageSelectActivity.h.isEmpty() ? size + languageSelectActivity.h.size() + 1 : size;
            default:
                qc9 qc9Var = (qc9) dVar;
                if (!z) {
                    return qc9Var.h.size() + (qc9Var.e < 0 ? 0 : 1);
                }
                ArrayList arrayList2 = qc9Var.f;
                if (arrayList2 != null) {
                    return arrayList2.size();
                }
                return 0;
        }
    }

    @Override // y59
    public final int d(int i) {
        int i2;
        byte b = this.c;
        d dVar = this.f;
        boolean z = this.e;
        switch (b) {
            case 0:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) dVar;
                if (!z) {
                    if (languageSelectActivity.getMessagesController().J2() || languageSelectActivity.getMessagesController().I2()) {
                        int i3 = i - 1;
                        if (i != 0) {
                            if (languageSelectActivity.getMessagesController().J2()) {
                                int i4 = i - 2;
                                if (i3 == 0) {
                                    languageSelectActivity.manualTranslationPosition = i;
                                    break;
                                } else {
                                    i3 = i4;
                                }
                            } else {
                                languageSelectActivity.manualTranslationPosition = -1;
                            }
                            if (!languageSelectActivity.getMessagesController().I2() || languageSelectActivity.getMessagesController().H3()) {
                                languageSelectActivity.autoTranslationPosition = -1;
                            } else {
                                int i5 = i3 - 1;
                                if (i3 == 0) {
                                    languageSelectActivity.autoTranslationPosition = i;
                                } else {
                                    i3 = i5;
                                }
                            }
                            if (languageSelectActivity.f0() || languageSelectActivity.g0()) {
                                languageSelectActivity.doNotTranslatePosition = i;
                                int i6 = i3 - 1;
                                if (i3 != 0) {
                                    i3 = i6;
                                }
                            }
                            i2 = i3 - 1;
                            if (i3 == 0) {
                                languageSelectActivity.n = i;
                                break;
                            }
                        }
                    } else {
                        i2 = i;
                    }
                    int i7 = i2 - 1;
                    if (i2 != 0) {
                        if (!languageSelectActivity.h.isEmpty()) {
                            if (i7 != languageSelectActivity.h.size()) {
                                if (i7 == languageSelectActivity.f.size() + languageSelectActivity.h.size() + 1) {
                                }
                            }
                        }
                        if (!languageSelectActivity.h.isEmpty() || i7 != languageSelectActivity.f.size()) {
                            languageSelectActivity.r = i - i7;
                        }
                    }
                }
                break;
            default:
                if (z || i != ((qc9) dVar).e) {
                    break;
                }
                break;
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:171:0x02dd, code lost:
    
        if (r2 == (r0.e.size() - 1)) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0331, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
    
        if (r2 == (r0.f.size() - 1)) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x032f, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0301, code lost:
    
        if (r2 == (r0.h.size() - 1)) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x032d, code lost:
    
        if (r2 == (r0.f.size() - 1)) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0062, code lost:
    
        if (r2 == (r0.h.size() - 1)) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0184, code lost:
    
        if (r4 <= java.lang.Math.min((r8.x - gm.L(34.0f)) / 2.0f, (r8.x - gm.L(84.0f)) - r1.getTextView().getPaint().measureText(r2))) goto L79;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0189  */
    @Override // y59
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(u69 u69Var, int i) {
        hb6 hb6Var;
        boolean z;
        int i2;
        int i3;
        String sb;
        boolean z2;
        int i4 = i;
        byte b = this.c;
        boolean z3 = this.e;
        CharSequence charSequence = null;
        r5 = null;
        r5 = null;
        r5 = null;
        u2c u2cVar = null;
        charSequence = null;
        d dVar = this.f;
        switch (b) {
            case 0:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) dVar;
                int i5 = u69Var.f;
                View view = u69Var.a;
                if (i5 == 0) {
                    if (!z3) {
                        i4 -= languageSelectActivity.r;
                    }
                    akb akbVar = (akb) view;
                    akbVar.c();
                    if (!z3) {
                        if (!languageSelectActivity.h.isEmpty() && i4 >= 0 && i4 < languageSelectActivity.h.size()) {
                            hb6Var = (hb6) languageSelectActivity.h.get(i4);
                            break;
                        } else {
                            if (!languageSelectActivity.h.isEmpty()) {
                                i4 = ts2.k(1, i4, languageSelectActivity.h);
                            }
                            hb6Var = (i4 < 0 || i4 >= languageSelectActivity.f.size()) ? null : (hb6) languageSelectActivity.f.get(i4);
                            break;
                        }
                    } else {
                        hb6Var = (i4 < 0 || i4 >= languageSelectActivity.e.size()) ? null : (hb6) languageSelectActivity.e.get(i4);
                        break;
                    }
                    if (hb6Var != null) {
                        boolean h = hb6Var.h();
                        String str = hb6Var.a;
                        if (h) {
                            akbVar.b(String.format("%1$s (%2$s)", str, jb6.M0(2131748808, null)), hb6Var.b, !z);
                        } else {
                            akbVar.b(str, hb6Var.b, !z);
                        }
                    }
                    akbVar.setChecked(hb6Var == jb6.D0().B);
                    break;
                } else {
                    if (i5 == 2) {
                        bjb bjbVar = (bjb) view;
                        View view2 = bjbVar.e;
                        TextView textView = bjbVar.d;
                        TextView textView2 = bjbVar.c;
                        boolean z4 = bjbVar.I;
                        boolean z5 = jb6.a0;
                        if (z4 != z5) {
                            bjbVar.I = z5;
                            textView2.setGravity((z5 ? 5 : 3) | 16);
                            bjbVar.removeView(textView2);
                            boolean z6 = jb6.a0;
                            bjbVar.addView(textView2, qoe.d(-1, -1.0f, (z6 ? 5 : 3) | 48, z6 ? 70.0f : bjbVar.F, 0.0f, z6 ? bjbVar.F : 70.0f, 0.0f));
                            textView.setGravity(jb6.a0 ? 5 : 3);
                            bjbVar.removeView(textView);
                            boolean z7 = jb6.a0;
                            bjbVar.addView(textView, qoe.d(-2, -2.0f, (z7 ? 5 : 3) | 48, z7 ? 64.0f : bjbVar.F, 36.0f, z7 ? bjbVar.F : 64.0f, 0.0f));
                            bjbVar.removeView(view2);
                            bjbVar.addView(view2, qoe.d(37, 20.0f, (jb6.a0 ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
                        }
                        i2 = languageSelectActivity.manualTranslationPosition;
                        if (i4 != i2) {
                            i3 = languageSelectActivity.autoTranslationPosition;
                            if (i4 == i3) {
                                CharSequence M0 = jb6.M0(2131745060, null);
                                boolean f0 = languageSelectActivity.f0();
                                if (!languageSelectActivity.g0() && !languageSelectActivity.f0()) {
                                    r6 = false;
                                }
                                bjbVar.f(M0, f0, r6);
                                bjbVar.setCheckBoxIcon(languageSelectActivity.getUserConfig().p() ? 0 : R.drawable.permission_locked);
                                break;
                            }
                        } else {
                            bjbVar.f(jb6.M0(2131745061, null), languageSelectActivity.g0(), true);
                            bjbVar.setCheckBoxIcon(0);
                            break;
                        }
                    } else if (i5 == 3) {
                        ((jf5) view).setText(jb6.M0((i4 == 0 && (languageSelectActivity.getMessagesController().J2() || languageSelectActivity.getMessagesController().I2())) ? 2131743642 : 2131748811, null));
                        break;
                    } else if (i5 == 4) {
                        vkb vkbVar = (vkb) view;
                        vkbVar.d();
                        HashSet c0 = qc9.c0();
                        String M02 = jb6.M0(2131751295, null);
                        try {
                            boolean[] zArr = new boolean[1];
                            if (c0.size() != 0) {
                                if (c0.size() != 1) {
                                    Iterator it = c0.iterator();
                                    StringBuilder sb2 = new StringBuilder();
                                    Object[] objArr = true;
                                    while (it.hasNext()) {
                                        String str2 = (String) it.next();
                                        if (objArr == false) {
                                            sb2.append(", ");
                                        }
                                        String E0 = s1c.E0(s1c.J0(str2, zArr, null));
                                        if (E0 != null) {
                                            sb2.append(E0);
                                            objArr = false;
                                        }
                                    }
                                    sb = sb2.toString();
                                    try {
                                        float measureText = vkbVar.getValueTextView().getPaint().measureText(sb);
                                        Point point = gm.q;
                                        break;
                                    } catch (Exception unused) {
                                        break;
                                    }
                                } else {
                                    charSequence = s1c.E0(s1c.J0((String) c0.iterator().next(), zArr, null));
                                }
                            } else {
                                charSequence = "";
                            }
                        } catch (Exception unused2) {
                        }
                        if (charSequence == null) {
                            charSequence = String.format(jb6.J0(c0.size(), "Languages"), Integer.valueOf(c0.size()));
                        }
                        vkbVar.c(M02, charSequence, true, false);
                        break;
                    } else if (i5 == 5) {
                        ((vkb) view).d();
                        break;
                    } else if (i5 == 6) {
                        njb njbVar = (njb) view;
                        sf1 sf1Var = njbVar.a;
                        boolean z8 = njbVar.n;
                        boolean z9 = jb6.a0;
                        if (z8 != z9) {
                            njbVar.n = z9;
                            sf1Var.setGravity(z9 ? 5 : 3);
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) sf1Var.getLayoutParams();
                            layoutParams.gravity = (jb6.a0 ? 5 : 3) | 48;
                            sf1Var.setLayoutParams(layoutParams);
                        }
                        if (i4 != languageSelectActivity.n) {
                            njbVar.setTopPadding(0);
                            njbVar.setBottomPadding(16);
                            break;
                        } else {
                            njbVar.setText(jb6.M0(2131743641, null));
                            njbVar.setTopPadding(11);
                            njbVar.setBottomPadding(16);
                            break;
                        }
                    }
                }
                break;
            default:
                qc9 qc9Var = (qc9) dVar;
                int i6 = u69Var.f;
                View view3 = u69Var.a;
                if (i6 == 0) {
                    cjb cjbVar = (cjb) view3;
                    if (z3) {
                        if (i4 >= 0 && i4 < qc9Var.f.size()) {
                            u2cVar = (u2c) qc9Var.f.get(i4);
                        }
                        break;
                    } else {
                        int i7 = qc9Var.e;
                        if (i7 >= 0 && i4 > i7) {
                            i4--;
                        }
                        if (i4 >= 0 && i4 < qc9Var.h.size()) {
                            u2cVar = (u2c) qc9Var.h.get(i4);
                            break;
                        }
                        z2 = false;
                    }
                    if (u2cVar != null) {
                        String str3 = u2cVar.c;
                        if (str3 == null) {
                            str3 = u2cVar.b;
                        }
                        cjbVar.b(str3, u2cVar.b, false, !z2);
                        cjbVar.setChecked(qc9Var.r.contains(u2cVar.a));
                        break;
                    }
                } else if (i6 == 1) {
                    break;
                }
                break;
        }
        return;
        charSequence = sb;
        if (charSequence == null) {
        }
        vkbVar.c(M02, charSequence, true, false);
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        View view;
        View view2;
        byte b = this.c;
        Context context = this.d;
        switch (b) {
            case 0:
                if (i != 0) {
                    view = i != 2 ? i != 3 ? (i == 4 || i == 5) ? new vkb(context) : i != 6 ? new bba(context, (hg9) null) : new njb(context) : new jf5(context) : new bjb(context);
                } else {
                    akb akbVar = new akb(context);
                    akbVar.e = 50;
                    akbVar.n = (byte) 21;
                    TextView textView = new TextView(context);
                    akbVar.a = textView;
                    anb.X(textView, cmb.F6, null);
                    wi8.w(textView, 1, 16.0f, 1, 1);
                    textView.setSingleLine(true);
                    textView.setGravity((jb6.a0 ? 5 : 3) | 16);
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    textView.setEllipsize(truncateAt);
                    boolean z = jb6.a0;
                    akbVar.addView(textView, qoe.d(-1, -1.0f, (z ? 5 : 3) | 48, z ? 21.0f : 64.0f, 0.0f, z ? 64.0f : 21.0f, 0.0f));
                    TextView textView2 = new TextView(context);
                    akbVar.b = textView2;
                    anb.X(textView2, cmb.y6, null);
                    textView2.setTextSize(1, 13.0f);
                    textView2.setGravity(jb6.a0 ? 5 : 3);
                    textView2.setLines(1);
                    textView2.setMaxLines(1);
                    textView2.setSingleLine(true);
                    textView2.setPadding(0, 0, 0, 0);
                    textView2.setEllipsize(truncateAt);
                    boolean z2 = jb6.a0;
                    akbVar.addView(textView2, qoe.d(-2, -2.0f, (z2 ? 5 : 3) | 48, z2 ? 21.0f : 64.0f, 36.0f, z2 ? 64.0f : 21.0f, 0.0f));
                    RadioButton radioButton = new RadioButton(context);
                    akbVar.c = radioButton;
                    radioButton.setSize(gm.L(20.0f));
                    anb.O(radioButton, cmb.f7, cmb.g7, null);
                    akbVar.addView(radioButton, qoe.d(20, 20.0f, (jb6.a0 ? 5 : 3) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
                    akbVar.h = jb6.a0;
                    akbVar.setClipChildren(false);
                    view = akbVar;
                }
                return new b59(view);
            default:
                if (i == 0) {
                    view2 = new cjb(context);
                } else if (i != 2) {
                    view2 = new bba(context, (hg9) null);
                } else {
                    jf5 jf5Var = new jf5(context);
                    jf5Var.setText(jb6.M0(2131752061, null));
                    view2 = jf5Var;
                }
                return new b59(view2);
        }
    }

    @Override // y59
    public final void y(u69 u69Var) {
        switch (this.c) {
            case 0:
                View view = u69Var.a;
                if (view instanceof akb) {
                    ((akb) view).c();
                    break;
                }
                break;
        }
    }
}
