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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.LanguageSelectActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class nz5 extends c79 {
    public final /* synthetic */ byte c;
    public final Context d;
    public final boolean e;
    public final /* synthetic */ e f;

    public /* synthetic */ nz5(e eVar, Context context, boolean z, byte b) {
        this.c = b;
        this.f = eVar;
        this.d = context;
        this.e = z;
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        switch (this.c) {
            case 0:
                int i = f89Var.f;
                if (i == 0 || i == 4 || i == 5 || i == 2) {
                    break;
                }
                break;
            default:
                if (f89Var.f == 0) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // j79
    public final int b() {
        int i;
        byte b = this.c;
        e eVar = this.f;
        boolean z = this.e;
        switch (b) {
            case 0:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) eVar;
                if (z) {
                    ArrayList arrayList = languageSelectActivity.e;
                    if (arrayList != null) {
                        return arrayList.size();
                    }
                    return 0;
                }
                if (languageSelectActivity.getMessagesController().N2() || languageSelectActivity.getMessagesController().M2()) {
                    int i2 = languageSelectActivity.getMessagesController().N2() ? 3 : 2;
                    if (languageSelectActivity.getMessagesController().M2() && !languageSelectActivity.getMessagesController().M3()) {
                        i2++;
                    }
                    if (languageSelectActivity.e0() || languageSelectActivity.f0()) {
                        i2++;
                    }
                    i = i2 + 1;
                } else {
                    i = 1;
                }
                int size = languageSelectActivity.f.size() + i + 1;
                return !languageSelectActivity.h.isEmpty() ? size + languageSelectActivity.h.size() + 1 : size;
            default:
                ee9 ee9Var = (ee9) eVar;
                if (!z) {
                    return ee9Var.h.size() + (ee9Var.e < 0 ? 0 : 1);
                }
                ArrayList arrayList2 = ee9Var.f;
                if (arrayList2 != null) {
                    return arrayList2.size();
                }
                return 0;
        }
    }

    @Override // j79
    public final int d(int i) {
        int i2;
        byte b = this.c;
        e eVar = this.f;
        boolean z = this.e;
        switch (b) {
            case 0:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) eVar;
                if (!z) {
                    if (languageSelectActivity.getMessagesController().N2() || languageSelectActivity.getMessagesController().M2()) {
                        int i3 = i - 1;
                        if (i != 0) {
                            if (languageSelectActivity.getMessagesController().N2()) {
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
                            if (!languageSelectActivity.getMessagesController().M2() || languageSelectActivity.getMessagesController().M3()) {
                                languageSelectActivity.autoTranslationPosition = -1;
                            } else {
                                int i5 = i3 - 1;
                                if (i3 == 0) {
                                    languageSelectActivity.autoTranslationPosition = i;
                                } else {
                                    i3 = i5;
                                }
                            }
                            if (languageSelectActivity.e0() || languageSelectActivity.f0()) {
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
                if (z || i != ((ee9) eVar).e) {
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
    
        if (r4 <= java.lang.Math.min((r8.x - hl.L(34.0f)) / 2.0f, (r8.x - hl.L(84.0f)) - r1.getTextView().getPaint().measureText(r2))) goto L79;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0189  */
    @Override // j79
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(f89 f89Var, int i) {
        mb6 mb6Var;
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
        t4c t4cVar = null;
        charSequence = null;
        e eVar = this.f;
        switch (b) {
            case 0:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) eVar;
                int i5 = f89Var.f;
                View view = f89Var.a;
                if (i5 == 0) {
                    if (!z3) {
                        i4 -= languageSelectActivity.r;
                    }
                    ulb ulbVar = (ulb) view;
                    ulbVar.c();
                    if (!z3) {
                        if (!languageSelectActivity.h.isEmpty() && i4 >= 0 && i4 < languageSelectActivity.h.size()) {
                            mb6Var = (mb6) languageSelectActivity.h.get(i4);
                            break;
                        } else {
                            if (!languageSelectActivity.h.isEmpty()) {
                                i4 = bs2.k(1, i4, languageSelectActivity.h);
                            }
                            mb6Var = (i4 < 0 || i4 >= languageSelectActivity.f.size()) ? null : (mb6) languageSelectActivity.f.get(i4);
                            break;
                        }
                    } else {
                        mb6Var = (i4 < 0 || i4 >= languageSelectActivity.e.size()) ? null : (mb6) languageSelectActivity.e.get(i4);
                        break;
                    }
                    if (mb6Var != null) {
                        boolean h = mb6Var.h();
                        String str = mb6Var.a;
                        if (h) {
                            ulbVar.b(String.format("%1$s (%2$s)", str, ob6.M0(2131748805, null)), mb6Var.b, !z);
                        } else {
                            ulbVar.b(str, mb6Var.b, !z);
                        }
                    }
                    ulbVar.setChecked(mb6Var == ob6.D0().B);
                    break;
                } else {
                    if (i5 == 2) {
                        wkb wkbVar = (wkb) view;
                        View view2 = wkbVar.e;
                        TextView textView = wkbVar.d;
                        TextView textView2 = wkbVar.c;
                        boolean z4 = wkbVar.I;
                        boolean z5 = ob6.a0;
                        if (z4 != z5) {
                            wkbVar.I = z5;
                            textView2.setGravity((z5 ? 5 : 3) | 16);
                            wkbVar.removeView(textView2);
                            boolean z6 = ob6.a0;
                            wkbVar.addView(textView2, tre.d(-1, -1.0f, (z6 ? 5 : 3) | 48, z6 ? 70.0f : wkbVar.F, 0.0f, z6 ? wkbVar.F : 70.0f, 0.0f));
                            textView.setGravity(ob6.a0 ? 5 : 3);
                            wkbVar.removeView(textView);
                            boolean z7 = ob6.a0;
                            wkbVar.addView(textView, tre.d(-2, -2.0f, (z7 ? 5 : 3) | 48, z7 ? 64.0f : wkbVar.F, 36.0f, z7 ? wkbVar.F : 64.0f, 0.0f));
                            wkbVar.removeView(view2);
                            wkbVar.addView(view2, tre.d(37, 20.0f, (ob6.a0 ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
                        }
                        i2 = languageSelectActivity.manualTranslationPosition;
                        if (i4 != i2) {
                            i3 = languageSelectActivity.autoTranslationPosition;
                            if (i4 == i3) {
                                CharSequence M0 = ob6.M0(2131745054, null);
                                boolean e0 = languageSelectActivity.e0();
                                if (!languageSelectActivity.f0() && !languageSelectActivity.e0()) {
                                    r6 = false;
                                }
                                wkbVar.f(M0, e0, r6);
                                wkbVar.setCheckBoxIcon(languageSelectActivity.getUserConfig().p() ? 0 : R.drawable.permission_locked);
                                break;
                            }
                        } else {
                            wkbVar.f(ob6.M0(2131745055, null), languageSelectActivity.f0(), true);
                            wkbVar.setCheckBoxIcon(0);
                            break;
                        }
                    } else if (i5 == 3) {
                        ((mf5) view).setText(ob6.M0((i4 == 0 && (languageSelectActivity.getMessagesController().N2() || languageSelectActivity.getMessagesController().M2())) ? 2131743610 : 2131748808, null));
                        break;
                    } else if (i5 == 4) {
                        qmb qmbVar = (qmb) view;
                        qmbVar.d();
                        HashSet b0 = ee9.b0();
                        String M02 = ob6.M0(2131751323, null);
                        try {
                            boolean[] zArr = new boolean[1];
                            if (b0.size() != 0) {
                                if (b0.size() != 1) {
                                    Iterator it = b0.iterator();
                                    StringBuilder sb2 = new StringBuilder();
                                    Object[] objArr = true;
                                    while (it.hasNext()) {
                                        String str2 = (String) it.next();
                                        if (objArr == false) {
                                            sb2.append(", ");
                                        }
                                        String F0 = r3c.F0(r3c.K0(str2, zArr, null));
                                        if (F0 != null) {
                                            sb2.append(F0);
                                            objArr = false;
                                        }
                                    }
                                    sb = sb2.toString();
                                    try {
                                        float measureText = qmbVar.getValueTextView().getPaint().measureText(sb);
                                        Point point = hl.q;
                                        break;
                                    } catch (Exception unused) {
                                        break;
                                    }
                                } else {
                                    charSequence = r3c.F0(r3c.K0((String) b0.iterator().next(), zArr, null));
                                }
                            } else {
                                charSequence = "";
                            }
                        } catch (Exception unused2) {
                        }
                        if (charSequence == null) {
                            charSequence = String.format(ob6.J0(b0.size(), "Languages"), Integer.valueOf(b0.size()));
                        }
                        qmbVar.c(M02, charSequence, true, false);
                        break;
                    } else if (i5 == 5) {
                        ((qmb) view).d();
                        break;
                    } else if (i5 == 6) {
                        ilb ilbVar = (ilb) view;
                        te1 te1Var = ilbVar.a;
                        boolean z8 = ilbVar.n;
                        boolean z9 = ob6.a0;
                        if (z8 != z9) {
                            ilbVar.n = z9;
                            te1Var.setGravity(z9 ? 5 : 3);
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) te1Var.getLayoutParams();
                            layoutParams.gravity = (ob6.a0 ? 5 : 3) | 48;
                            te1Var.setLayoutParams(layoutParams);
                        }
                        if (i4 != languageSelectActivity.n) {
                            ilbVar.setTopPadding(0);
                            ilbVar.setBottomPadding(16);
                            break;
                        } else {
                            ilbVar.setText(ob6.M0(2131743609, null));
                            ilbVar.setTopPadding(11);
                            ilbVar.setBottomPadding(16);
                            break;
                        }
                    }
                }
                break;
            default:
                ee9 ee9Var = (ee9) eVar;
                int i6 = f89Var.f;
                View view3 = f89Var.a;
                if (i6 == 0) {
                    xkb xkbVar = (xkb) view3;
                    if (z3) {
                        if (i4 >= 0 && i4 < ee9Var.f.size()) {
                            t4cVar = (t4c) ee9Var.f.get(i4);
                        }
                        break;
                    } else {
                        int i7 = ee9Var.e;
                        if (i7 >= 0 && i4 > i7) {
                            i4--;
                        }
                        if (i4 >= 0 && i4 < ee9Var.h.size()) {
                            t4cVar = (t4c) ee9Var.h.get(i4);
                            break;
                        }
                        z2 = false;
                    }
                    if (t4cVar != null) {
                        String str3 = t4cVar.c;
                        if (str3 == null) {
                            str3 = t4cVar.b;
                        }
                        xkbVar.b(str3, t4cVar.b, false, !z2);
                        xkbVar.setChecked(ee9Var.r.contains(t4cVar.a));
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
        qmbVar.c(M02, charSequence, true, false);
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        View view;
        View view2;
        byte b = this.c;
        Context context = this.d;
        switch (b) {
            case 0:
                if (i != 0) {
                    view = i != 2 ? i != 3 ? (i == 4 || i == 5) ? new qmb(context) : i != 6 ? new rca(context, (uh9) null) : new ilb(context) : new mf5(context) : new wkb(context);
                } else {
                    ulb ulbVar = new ulb(context);
                    ulbVar.e = 50;
                    ulbVar.n = (byte) 21;
                    TextView textView = new TextView(context);
                    ulbVar.a = textView;
                    yob.X(textView, aob.G6, null);
                    ik8.w(textView, 1, 16.0f, 1, 1);
                    textView.setSingleLine(true);
                    textView.setGravity((ob6.a0 ? 5 : 3) | 16);
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    textView.setEllipsize(truncateAt);
                    boolean z = ob6.a0;
                    ulbVar.addView(textView, tre.d(-1, -1.0f, (z ? 5 : 3) | 48, z ? 21.0f : 64.0f, 0.0f, z ? 64.0f : 21.0f, 0.0f));
                    TextView textView2 = new TextView(context);
                    ulbVar.b = textView2;
                    yob.X(textView2, aob.z6, null);
                    textView2.setTextSize(1, 13.0f);
                    textView2.setGravity(ob6.a0 ? 5 : 3);
                    textView2.setLines(1);
                    textView2.setMaxLines(1);
                    textView2.setSingleLine(true);
                    textView2.setPadding(0, 0, 0, 0);
                    textView2.setEllipsize(truncateAt);
                    boolean z2 = ob6.a0;
                    ulbVar.addView(textView2, tre.d(-2, -2.0f, (z2 ? 5 : 3) | 48, z2 ? 21.0f : 64.0f, 36.0f, z2 ? 64.0f : 21.0f, 0.0f));
                    RadioButton radioButton = new RadioButton(context);
                    ulbVar.c = radioButton;
                    radioButton.setSize(hl.L(20.0f));
                    yob.O(radioButton, aob.g7, aob.h7, null);
                    ulbVar.addView(radioButton, tre.d(20, 20.0f, (ob6.a0 ? 5 : 3) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
                    ulbVar.h = ob6.a0;
                    ulbVar.setClipChildren(false);
                    view = ulbVar;
                }
                return new n69(view);
            default:
                if (i == 0) {
                    view2 = new xkb(context);
                } else if (i != 2) {
                    view2 = new rca(context, (uh9) null);
                } else {
                    mf5 mf5Var = new mf5(context);
                    mf5Var.setText(ob6.M0(2131752089, null));
                    view2 = mf5Var;
                }
                return new n69(view2);
        }
    }

    @Override // j79
    public final void y(f89 f89Var) {
        switch (this.c) {
            case 0:
                View view = f89Var.a;
                if (view instanceof ulb) {
                    ((ulb) view).c();
                    break;
                }
                break;
        }
    }
}
