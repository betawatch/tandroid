package org.telegram.ui;

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
import org.telegram.ui.Components.RadioButton;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class i70 extends org.telegram.ui.Components.sk0 {
    public final /* synthetic */ int c;
    public final Context d;
    public final boolean e;
    public final /* synthetic */ org.telegram.ui.ActionBar.k2 f;

    public /* synthetic */ i70(org.telegram.ui.ActionBar.k2 k2Var, Context context, boolean z10, int i10) {
        this.c = i10;
        this.f = k2Var;
        this.d = context;
        this.e = z10;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        switch (this.c) {
            case 0:
                int i10 = c1Var.f;
                return i10 == 0 || i10 == 4 || i10 == 5 || i10 == 2;
            default:
                return c1Var.f == 0;
        }
    }

    @Override // s4.g0
    public final int b() {
        int i10;
        switch (this.c) {
            case 0:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.f;
                if (this.e) {
                    ArrayList arrayList = languageSelectActivity.e;
                    if (arrayList == null) {
                        return 0;
                    }
                    return arrayList.size();
                }
                if (languageSelectActivity.getMessagesController().G2() || languageSelectActivity.getMessagesController().F2()) {
                    int i11 = languageSelectActivity.getMessagesController().G2() ? 3 : 2;
                    if (languageSelectActivity.getMessagesController().F2() && !languageSelectActivity.getMessagesController().A3()) {
                        i11++;
                    }
                    if (languageSelectActivity.k0() || languageSelectActivity.l0()) {
                        i11++;
                    }
                    i10 = i11 + 1;
                } else {
                    i10 = 1;
                }
                int size = i10 + 1 + languageSelectActivity.f.size();
                return !languageSelectActivity.h.isEmpty() ? languageSelectActivity.h.size() + 1 + size : size;
            default:
                e01 e01Var = (e01) this.f;
                if (!this.e) {
                    return (e01Var.e >= 0 ? 1 : 0) + e01Var.h.size();
                }
                ArrayList arrayList2 = e01Var.f;
                if (arrayList2 == null) {
                    return 0;
                }
                return arrayList2.size();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00bd, code lost:
    
        if (r1 != ((r0.f.size() + r0.h.size()) + 1)) goto L61;
     */
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int d(int i10) {
        int i11;
        int i12;
        switch (this.c) {
            case 0:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.f;
                if (this.e) {
                    return 0;
                }
                if (languageSelectActivity.getMessagesController().G2() || languageSelectActivity.getMessagesController().F2()) {
                    int i13 = i10 - 1;
                    if (i10 != 0) {
                        i11 = 2;
                        if (languageSelectActivity.getMessagesController().G2()) {
                            int i14 = i10 - 2;
                            if (i13 == 0) {
                                languageSelectActivity.manualTranslationPosition = i10;
                                return i11;
                            }
                            i13 = i14;
                        } else {
                            languageSelectActivity.manualTranslationPosition = -1;
                        }
                        if (!languageSelectActivity.getMessagesController().F2() || languageSelectActivity.getMessagesController().A3()) {
                            languageSelectActivity.autoTranslationPosition = -1;
                        } else {
                            int i15 = i13 - 1;
                            if (i13 == 0) {
                                languageSelectActivity.autoTranslationPosition = i10;
                                return i11;
                            }
                            i13 = i15;
                        }
                        if (languageSelectActivity.k0() || languageSelectActivity.l0()) {
                            languageSelectActivity.doNotTranslatePosition = i10;
                            int i16 = i13 - 1;
                            if (i13 == 0) {
                                return 4;
                            }
                            i13 = i16;
                        }
                        i12 = i13 - 1;
                        if (i13 == 0) {
                            languageSelectActivity.n = i10;
                            return 6;
                        }
                    }
                    return 3;
                }
                i12 = i10;
                int i17 = i12 - 1;
                if (i12 != 0) {
                    i11 = 1;
                    if (!languageSelectActivity.h.isEmpty()) {
                        if (i17 != languageSelectActivity.h.size()) {
                            break;
                        }
                        return i11;
                    }
                    if (!languageSelectActivity.h.isEmpty() || i17 != languageSelectActivity.f.size()) {
                        languageSelectActivity.r = i10 - i17;
                        return 0;
                    }
                    return i11;
                }
                return 3;
            default:
                return (!this.e && i10 == ((e01) this.f).e) ? 1 : 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:171:0x02e8, code lost:
    
        if (r2 == (r6.e.size() - 1)) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x02ea, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003e, code lost:
    
        if (r2 == (r6.f.size() - 1)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x02ec, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x030f, code lost:
    
        if (r2 == (r6.h.size() - 1)) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x033b, code lost:
    
        if (r2 == (r6.f.size() - 1)) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0064, code lost:
    
        if (r2 == (r6.h.size() - 1)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x018a, code lost:
    
        if (r6 > java.lang.Math.min((r9.x - org.telegram.messenger.i0.L(34.0f)) / 2.0f, (r9.x - org.telegram.messenger.i0.L(84.0f)) - r1.getTextView().getPaint().measureText(r3))) goto L86;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0190  */
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(s4.c1 c1Var, int i10) {
        org.telegram.messenger.zc zcVar;
        boolean z10;
        int i11;
        int i12;
        String sb2;
        boolean z11;
        int i13 = i10;
        int i14 = this.c;
        boolean z12 = this.e;
        CharSequence charSequence = null;
        r5 = null;
        r5 = null;
        r5 = null;
        org.telegram.messenger.m10 m10Var = null;
        charSequence = null;
        org.telegram.ui.ActionBar.k2 k2Var = this.f;
        switch (i14) {
            case 0:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) k2Var;
                int i15 = c1Var.f;
                View view = c1Var.a;
                if (i15 == 0) {
                    if (!z12) {
                        i13 -= languageSelectActivity.r;
                    }
                    org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) view;
                    d9Var.c();
                    if (!z12) {
                        if (!languageSelectActivity.h.isEmpty() && i13 >= 0 && i13 < languageSelectActivity.h.size()) {
                            zcVar = (org.telegram.messenger.zc) languageSelectActivity.h.get(i13);
                            break;
                        } else {
                            if (!languageSelectActivity.h.isEmpty()) {
                                i13 = sc.e.e(1, i13, languageSelectActivity.h);
                            }
                            zcVar = (i13 < 0 || i13 >= languageSelectActivity.f.size()) ? null : (org.telegram.messenger.zc) languageSelectActivity.f.get(i13);
                            break;
                        }
                    } else {
                        zcVar = (i13 < 0 || i13 >= languageSelectActivity.e.size()) ? null : (org.telegram.messenger.zc) languageSelectActivity.e.get(i13);
                        break;
                    }
                    if (zcVar != null) {
                        if (zcVar.h()) {
                            d9Var.b(String.format("%1$s (%2$s)", zcVar.a, org.telegram.messenger.cd.L0(2131749061, null)), zcVar.b, !z10);
                        } else {
                            d9Var.b(zcVar.a, zcVar.b, !z10);
                        }
                    }
                    d9Var.setChecked(zcVar == org.telegram.messenger.cd.D0().B);
                    break;
                } else {
                    if (i15 == 2) {
                        org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
                        View view2 = t8Var.e;
                        TextView textView = t8Var.d;
                        TextView textView2 = t8Var.c;
                        boolean z13 = t8Var.H;
                        boolean z14 = org.telegram.messenger.cd.X;
                        if (z13 != z14) {
                            t8Var.H = z14;
                            textView2.setGravity((z14 ? 5 : 3) | 16);
                            t8Var.removeView(textView2);
                            boolean z15 = org.telegram.messenger.cd.X;
                            t8Var.addView(textView2, w7.b6.d(-1, -1.0f, (z15 ? 5 : 3) | 48, z15 ? 70.0f : t8Var.E, 0.0f, z15 ? t8Var.E : 70.0f, 0.0f));
                            textView.setGravity(org.telegram.messenger.cd.X ? 5 : 3);
                            t8Var.removeView(textView);
                            boolean z16 = org.telegram.messenger.cd.X;
                            t8Var.addView(textView, w7.b6.d(-2, -2.0f, (z16 ? 5 : 3) | 48, z16 ? 64.0f : t8Var.E, 36.0f, z16 ? t8Var.E : 64.0f, 0.0f));
                            t8Var.removeView(view2);
                            t8Var.addView(view2, w7.b6.d(37, 20.0f, (org.telegram.messenger.cd.X ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
                        }
                        i11 = languageSelectActivity.manualTranslationPosition;
                        if (i13 != i11) {
                            i12 = languageSelectActivity.autoTranslationPosition;
                            if (i13 == i12) {
                                CharSequence L0 = org.telegram.messenger.cd.L0(2131745344, null);
                                boolean k02 = languageSelectActivity.k0();
                                if (!languageSelectActivity.l0() && !languageSelectActivity.k0()) {
                                    r7 = false;
                                }
                                t8Var.f(L0, k02, r7);
                                t8Var.setCheckBoxIcon(languageSelectActivity.getUserConfig().q() ? 0 : R.drawable.permission_locked);
                                break;
                            }
                        } else {
                            t8Var.f(org.telegram.messenger.cd.L0(2131745345, null), languageSelectActivity.l0(), true);
                            t8Var.setCheckBoxIcon(0);
                            break;
                        }
                    } else if (i15 == 3) {
                        ((org.telegram.ui.Cells.p4) view).setText(org.telegram.messenger.cd.L0((i13 == 0 && (languageSelectActivity.getMessagesController().G2() || languageSelectActivity.getMessagesController().F2())) ? 2131743980 : 2131749064, null));
                        break;
                    } else if (i15 == 4) {
                        org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) view;
                        x9Var.d();
                        HashSet c02 = e01.c0();
                        String L02 = org.telegram.messenger.cd.L0(2131751359, null);
                        try {
                            boolean[] zArr = new boolean[1];
                            if (c02.size() != 0) {
                                if (c02.size() != 1) {
                                    Iterator it = c02.iterator();
                                    StringBuilder sb3 = new StringBuilder();
                                    Object[] objArr = true;
                                    while (it.hasNext()) {
                                        String str = (String) it.next();
                                        if (objArr == false) {
                                            sb3.append(", ");
                                        }
                                        String K0 = org.telegram.ui.Components.m31.K0(org.telegram.ui.Components.m31.O0(str, zArr, null));
                                        if (K0 != null) {
                                            sb3.append(K0);
                                            objArr = false;
                                        }
                                    }
                                    sb2 = sb3.toString();
                                    try {
                                        float measureText = x9Var.getValueTextView().getPaint().measureText(sb2);
                                        Point point = org.telegram.messenger.i0.q;
                                        break;
                                    } catch (Exception unused) {
                                        break;
                                    }
                                } else {
                                    charSequence = org.telegram.ui.Components.m31.K0(org.telegram.ui.Components.m31.O0((String) c02.iterator().next(), zArr, null));
                                }
                            } else {
                                charSequence = "";
                            }
                        } catch (Exception unused2) {
                        }
                        if (charSequence == null) {
                            charSequence = String.format(org.telegram.messenger.cd.J0(c02.size(), "Languages"), Integer.valueOf(c02.size()));
                        }
                        x9Var.c(L02, charSequence, true, false);
                        break;
                    } else if (i15 == 5) {
                        ((org.telegram.ui.Cells.x9) view).d();
                        break;
                    } else if (i15 == 6) {
                        org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
                        org.telegram.ui.Cells.b2 b2Var = b9Var.a;
                        boolean z17 = b9Var.n;
                        boolean z18 = org.telegram.messenger.cd.X;
                        if (z17 != z18) {
                            b9Var.n = z18;
                            b2Var.setGravity(z18 ? 5 : 3);
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) b2Var.getLayoutParams();
                            layoutParams.gravity = (org.telegram.messenger.cd.X ? 5 : 3) | 48;
                            b2Var.setLayoutParams(layoutParams);
                        }
                        if (i13 != languageSelectActivity.n) {
                            b9Var.setTopPadding(0);
                            b9Var.setBottomPadding(16);
                            break;
                        } else {
                            b9Var.setText(org.telegram.messenger.cd.L0(2131743979, null));
                            b9Var.setTopPadding(11);
                            b9Var.setBottomPadding(16);
                            break;
                        }
                    }
                }
                break;
            default:
                e01 e01Var = (e01) k2Var;
                int i16 = c1Var.f;
                View view3 = c1Var.a;
                if (i16 == 0) {
                    org.telegram.ui.Cells.u8 u8Var = (org.telegram.ui.Cells.u8) view3;
                    if (z12) {
                        if (i13 >= 0 && i13 < e01Var.f.size()) {
                            m10Var = (org.telegram.messenger.m10) e01Var.f.get(i13);
                        }
                        break;
                    } else {
                        int i17 = e01Var.e;
                        if (i17 >= 0 && i13 > i17) {
                            i13--;
                        }
                        if (i13 >= 0 && i13 < e01Var.h.size()) {
                            m10Var = (org.telegram.messenger.m10) e01Var.h.get(i13);
                            break;
                        }
                        z11 = false;
                    }
                    if (m10Var != null) {
                        String str2 = m10Var.c;
                        if (str2 == null) {
                            str2 = m10Var.b;
                        }
                        u8Var.b(str2, m10Var.b, false, !z11);
                        u8Var.setChecked(e01Var.r.contains(m10Var.a));
                        break;
                    }
                } else if (i16 == 1) {
                    break;
                }
                break;
        }
        return;
        charSequence = sb2;
        if (charSequence == null) {
        }
        x9Var.c(L02, charSequence, true, false);
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        int i11 = this.c;
        Context context = this.d;
        switch (i11) {
            case 0:
                if (i10 != 0) {
                    view = i10 != 2 ? i10 != 3 ? (i10 == 4 || i10 == 5) ? new org.telegram.ui.Cells.x9(context) : i10 != 6 ? new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.f1) null) : new org.telegram.ui.Cells.b9(context) : new org.telegram.ui.Cells.p4(context) : new org.telegram.ui.Cells.t8(context);
                } else {
                    org.telegram.ui.Cells.d9 d9Var = new org.telegram.ui.Cells.d9(context);
                    d9Var.e = 50;
                    d9Var.r = 21;
                    TextView textView = new TextView(context);
                    d9Var.a = textView;
                    org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.G6, null);
                    org.telegram.messenger.z20.o(textView, 1, 16.0f, 1, 1);
                    textView.setSingleLine(true);
                    textView.setGravity((org.telegram.messenger.cd.X ? 5 : 3) | 16);
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    textView.setEllipsize(truncateAt);
                    boolean z10 = org.telegram.messenger.cd.X;
                    d9Var.addView(textView, w7.b6.d(-1, -1.0f, (z10 ? 5 : 3) | 48, z10 ? 21 : 64.0f, 0.0f, z10 ? 64.0f : 21, 0.0f));
                    TextView textView2 = new TextView(context);
                    d9Var.b = textView2;
                    org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.z6, null);
                    textView2.setTextSize(1, 13.0f);
                    textView2.setGravity(org.telegram.messenger.cd.X ? 5 : 3);
                    textView2.setLines(1);
                    textView2.setMaxLines(1);
                    textView2.setSingleLine(true);
                    textView2.setPadding(0, 0, 0, 0);
                    textView2.setEllipsize(truncateAt);
                    boolean z11 = org.telegram.messenger.cd.X;
                    d9Var.addView(textView2, w7.b6.d(-2, -2.0f, (z11 ? 5 : 3) | 48, z11 ? 21 : 64.0f, 36.0f, z11 ? 64.0f : 21, 0.0f));
                    RadioButton radioButton = new RadioButton(context);
                    d9Var.c = radioButton;
                    radioButton.setSize(org.telegram.messenger.i0.L(20.0f));
                    org.telegram.ui.ActionBar.a7.P(radioButton, org.telegram.ui.ActionBar.t6.g7, org.telegram.ui.ActionBar.t6.h7, null);
                    d9Var.addView(radioButton, w7.b6.d(20, 20.0f, (org.telegram.messenger.cd.X ? 5 : 3) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
                    d9Var.n = org.telegram.messenger.cd.X;
                    d9Var.setClipChildren(false);
                    view = d9Var;
                }
                return new org.telegram.ui.Components.ck0(view);
            default:
                if (i10 == 0) {
                    view2 = new org.telegram.ui.Cells.u8(context);
                } else if (i10 != 2) {
                    view2 = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.f1) null);
                } else {
                    org.telegram.ui.Cells.p4 p4Var = new org.telegram.ui.Cells.p4(context);
                    p4Var.setText(org.telegram.messenger.cd.L0(2131752124, null));
                    view2 = p4Var;
                }
                return new org.telegram.ui.Components.ck0(view2);
        }
    }

    @Override // s4.g0
    public void y(s4.c1 c1Var) {
        switch (this.c) {
            case 0:
                View view = c1Var.a;
                if (view instanceof org.telegram.ui.Cells.d9) {
                    ((org.telegram.ui.Cells.d9) view).c();
                    break;
                }
                break;
        }
    }
}
