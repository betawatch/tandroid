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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class k60 extends org.telegram.ui.Components.bk0 {
    public final /* synthetic */ int c;
    public final Context d;
    public final boolean e;
    public final /* synthetic */ org.telegram.ui.ActionBar.h2 f;

    public /* synthetic */ k60(org.telegram.ui.ActionBar.h2 h2Var, Context context, boolean z10, int i7) {
        this.c = i7;
        this.f = h2Var;
        this.d = context;
        this.e = z10;
    }

    @Override // org.telegram.ui.Components.bk0
    public final boolean D(v4.f1 f1Var) {
        switch (this.c) {
            case 0:
                int i7 = f1Var.f;
                return i7 == 0 || i7 == 4 || i7 == 5 || i7 == 2;
            default:
                return f1Var.f == 0;
        }
    }

    @Override // v4.i0
    public final int b() {
        int i7;
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
                if (languageSelectActivity.getMessagesController().N2() || languageSelectActivity.getMessagesController().M2()) {
                    int i10 = languageSelectActivity.getMessagesController().N2() ? 3 : 2;
                    if (languageSelectActivity.getMessagesController().M2() && !languageSelectActivity.getMessagesController().K3()) {
                        i10++;
                    }
                    if (languageSelectActivity.k0() || languageSelectActivity.l0()) {
                        i10++;
                    }
                    i7 = i10 + 1;
                } else {
                    i7 = 1;
                }
                int size = i7 + 1 + languageSelectActivity.f.size();
                return !languageSelectActivity.h.isEmpty() ? languageSelectActivity.h.size() + 1 + size : size;
            default:
                sy0 sy0Var = (sy0) this.f;
                if (!this.e) {
                    return (sy0Var.e >= 0 ? 1 : 0) + sy0Var.h.size();
                }
                ArrayList arrayList2 = sy0Var.f;
                if (arrayList2 == null) {
                    return 0;
                }
                return arrayList2.size();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00bd, code lost:
    
        if (r1 != ((r0.f.size() + r0.h.size()) + 1)) goto L61;
     */
    @Override // v4.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int d(int i7) {
        int i10;
        int i11;
        switch (this.c) {
            case 0:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.f;
                if (this.e) {
                    return 0;
                }
                if (languageSelectActivity.getMessagesController().N2() || languageSelectActivity.getMessagesController().M2()) {
                    int i12 = i7 - 1;
                    if (i7 != 0) {
                        i10 = 2;
                        if (languageSelectActivity.getMessagesController().N2()) {
                            int i13 = i7 - 2;
                            if (i12 == 0) {
                                languageSelectActivity.manualTranslationPosition = i7;
                                return i10;
                            }
                            i12 = i13;
                        } else {
                            languageSelectActivity.manualTranslationPosition = -1;
                        }
                        if (!languageSelectActivity.getMessagesController().M2() || languageSelectActivity.getMessagesController().K3()) {
                            languageSelectActivity.autoTranslationPosition = -1;
                        } else {
                            int i14 = i12 - 1;
                            if (i12 == 0) {
                                languageSelectActivity.autoTranslationPosition = i7;
                                return i10;
                            }
                            i12 = i14;
                        }
                        if (languageSelectActivity.k0() || languageSelectActivity.l0()) {
                            languageSelectActivity.doNotTranslatePosition = i7;
                            int i15 = i12 - 1;
                            if (i12 == 0) {
                                return 4;
                            }
                            i12 = i15;
                        }
                        i11 = i12 - 1;
                        if (i12 == 0) {
                            languageSelectActivity.n = i7;
                            return 6;
                        }
                    }
                    return 3;
                }
                i11 = i7;
                int i16 = i11 - 1;
                if (i11 != 0) {
                    i10 = 1;
                    if (!languageSelectActivity.h.isEmpty()) {
                        if (i16 != languageSelectActivity.h.size()) {
                            break;
                        }
                        return i10;
                    }
                    if (!languageSelectActivity.h.isEmpty() || i16 != languageSelectActivity.f.size()) {
                        languageSelectActivity.r = i7 - i16;
                        return 0;
                    }
                    return i10;
                }
                return 3;
            default:
                return (!this.e && i7 == ((sy0) this.f).e) ? 1 : 0;
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
    
        if (r6 > java.lang.Math.min((r9.x - org.telegram.messenger.g0.L(34.0f)) / 2.0f, (r9.x - org.telegram.messenger.g0.L(84.0f)) - r1.getTextView().getPaint().measureText(r3))) goto L86;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0190  */
    @Override // v4.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.f1 f1Var, int i7) {
        org.telegram.messenger.cd cdVar;
        boolean z10;
        int i10;
        int i11;
        String sb2;
        boolean z11;
        int i12 = i7;
        int i13 = this.c;
        boolean z12 = this.e;
        CharSequence charSequence = null;
        r5 = null;
        r5 = null;
        r5 = null;
        org.telegram.messenger.s00 s00Var = null;
        charSequence = null;
        org.telegram.ui.ActionBar.h2 h2Var = this.f;
        switch (i13) {
            case 0:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) h2Var;
                int i14 = f1Var.f;
                View view = f1Var.a;
                if (i14 == 0) {
                    if (!z12) {
                        i12 -= languageSelectActivity.r;
                    }
                    org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
                    b9Var.c();
                    if (!z12) {
                        if (!languageSelectActivity.h.isEmpty() && i12 >= 0 && i12 < languageSelectActivity.h.size()) {
                            cdVar = (org.telegram.messenger.cd) languageSelectActivity.h.get(i12);
                            break;
                        } else {
                            if (!languageSelectActivity.h.isEmpty()) {
                                i12 = i5.c.f(1, i12, languageSelectActivity.h);
                            }
                            cdVar = (i12 < 0 || i12 >= languageSelectActivity.f.size()) ? null : (org.telegram.messenger.cd) languageSelectActivity.f.get(i12);
                            break;
                        }
                    } else {
                        cdVar = (i12 < 0 || i12 >= languageSelectActivity.e.size()) ? null : (org.telegram.messenger.cd) languageSelectActivity.e.get(i12);
                        break;
                    }
                    if (cdVar != null) {
                        if (cdVar.h()) {
                            b9Var.b(String.format("%1$s (%2$s)", cdVar.a, org.telegram.messenger.gd.M0(2131748859, null)), cdVar.b, !z10);
                        } else {
                            b9Var.b(cdVar.a, cdVar.b, !z10);
                        }
                    }
                    b9Var.setChecked(cdVar == org.telegram.messenger.gd.E0().B);
                    break;
                } else {
                    if (i14 == 2) {
                        org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                        View view2 = r8Var.e;
                        TextView textView = r8Var.d;
                        TextView textView2 = r8Var.c;
                        boolean z13 = r8Var.I;
                        boolean z14 = org.telegram.messenger.gd.a0;
                        if (z13 != z14) {
                            r8Var.I = z14;
                            textView2.setGravity((z14 ? 5 : 3) | 16);
                            r8Var.removeView(textView2);
                            boolean z15 = org.telegram.messenger.gd.a0;
                            r8Var.addView(textView2, c8.ma.d(-1, -1.0f, (z15 ? 5 : 3) | 48, z15 ? 70.0f : r8Var.F, 0.0f, z15 ? r8Var.F : 70.0f, 0.0f));
                            textView.setGravity(org.telegram.messenger.gd.a0 ? 5 : 3);
                            r8Var.removeView(textView);
                            boolean z16 = org.telegram.messenger.gd.a0;
                            r8Var.addView(textView, c8.ma.d(-2, -2.0f, (z16 ? 5 : 3) | 48, z16 ? 64.0f : r8Var.F, 36.0f, z16 ? r8Var.F : 64.0f, 0.0f));
                            r8Var.removeView(view2);
                            r8Var.addView(view2, c8.ma.d(37, 20.0f, (org.telegram.messenger.gd.a0 ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
                        }
                        i10 = languageSelectActivity.manualTranslationPosition;
                        if (i12 != i10) {
                            i11 = languageSelectActivity.autoTranslationPosition;
                            if (i12 == i11) {
                                CharSequence M0 = org.telegram.messenger.gd.M0(2131745131, null);
                                boolean k02 = languageSelectActivity.k0();
                                if (!languageSelectActivity.l0() && !languageSelectActivity.k0()) {
                                    r7 = false;
                                }
                                r8Var.f(M0, k02, r7);
                                r8Var.setCheckBoxIcon(languageSelectActivity.getUserConfig().q() ? 0 : R.drawable.permission_locked);
                                break;
                            }
                        } else {
                            r8Var.f(org.telegram.messenger.gd.M0(2131745132, null), languageSelectActivity.l0(), true);
                            r8Var.setCheckBoxIcon(0);
                            break;
                        }
                    } else if (i14 == 3) {
                        ((org.telegram.ui.Cells.n4) view).setText(org.telegram.messenger.gd.M0((i12 == 0 && (languageSelectActivity.getMessagesController().N2() || languageSelectActivity.getMessagesController().M2())) ? 2131743718 : 2131748862, null));
                        break;
                    } else if (i14 == 4) {
                        org.telegram.ui.Cells.w9 w9Var = (org.telegram.ui.Cells.w9) view;
                        w9Var.d();
                        HashSet d02 = sy0.d0();
                        String M02 = org.telegram.messenger.gd.M0(2131751347, null);
                        try {
                            boolean[] zArr = new boolean[1];
                            if (d02.size() != 0) {
                                if (d02.size() != 1) {
                                    Iterator it = d02.iterator();
                                    StringBuilder sb3 = new StringBuilder();
                                    Object[] objArr = true;
                                    while (it.hasNext()) {
                                        String str = (String) it.next();
                                        if (objArr == false) {
                                            sb3.append(", ");
                                        }
                                        String L0 = org.telegram.ui.Components.y21.L0(org.telegram.ui.Components.y21.P0(str, zArr, null));
                                        if (L0 != null) {
                                            sb3.append(L0);
                                            objArr = false;
                                        }
                                    }
                                    sb2 = sb3.toString();
                                    try {
                                        float measureText = w9Var.getValueTextView().getPaint().measureText(sb2);
                                        Point point = org.telegram.messenger.g0.q;
                                        break;
                                    } catch (Exception unused) {
                                        break;
                                    }
                                } else {
                                    charSequence = org.telegram.ui.Components.y21.L0(org.telegram.ui.Components.y21.P0((String) d02.iterator().next(), zArr, null));
                                }
                            } else {
                                charSequence = "";
                            }
                        } catch (Exception unused2) {
                        }
                        if (charSequence == null) {
                            charSequence = String.format(org.telegram.messenger.gd.K0(d02.size(), "Languages"), Integer.valueOf(d02.size()));
                        }
                        w9Var.c(M02, charSequence, true, false);
                        break;
                    } else if (i14 == 5) {
                        ((org.telegram.ui.Cells.w9) view).d();
                        break;
                    } else if (i14 == 6) {
                        org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
                        org.telegram.ui.Cells.b2 b2Var = z8Var.a;
                        boolean z17 = z8Var.n;
                        boolean z18 = org.telegram.messenger.gd.a0;
                        if (z17 != z18) {
                            z8Var.n = z18;
                            b2Var.setGravity(z18 ? 5 : 3);
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) b2Var.getLayoutParams();
                            layoutParams.gravity = (org.telegram.messenger.gd.a0 ? 5 : 3) | 48;
                            b2Var.setLayoutParams(layoutParams);
                        }
                        if (i12 != languageSelectActivity.n) {
                            z8Var.setTopPadding(0);
                            z8Var.setBottomPadding(16);
                            break;
                        } else {
                            z8Var.setText(org.telegram.messenger.gd.M0(2131743717, null));
                            z8Var.setTopPadding(11);
                            z8Var.setBottomPadding(16);
                            break;
                        }
                    }
                }
                break;
            default:
                sy0 sy0Var = (sy0) h2Var;
                int i15 = f1Var.f;
                View view3 = f1Var.a;
                if (i15 == 0) {
                    org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view3;
                    if (z12) {
                        if (i12 >= 0 && i12 < sy0Var.f.size()) {
                            s00Var = (org.telegram.messenger.s00) sy0Var.f.get(i12);
                        }
                        break;
                    } else {
                        int i16 = sy0Var.e;
                        if (i16 >= 0 && i12 > i16) {
                            i12--;
                        }
                        if (i12 >= 0 && i12 < sy0Var.h.size()) {
                            s00Var = (org.telegram.messenger.s00) sy0Var.h.get(i12);
                            break;
                        }
                        z11 = false;
                    }
                    if (s00Var != null) {
                        String str2 = s00Var.c;
                        if (str2 == null) {
                            str2 = s00Var.b;
                        }
                        s8Var.b(str2, s00Var.b, false, !z11);
                        s8Var.setChecked(sy0Var.r.contains(s00Var.a));
                        break;
                    }
                } else if (i15 == 1) {
                    break;
                }
                break;
        }
        return;
        charSequence = sb2;
        if (charSequence == null) {
        }
        w9Var.c(M02, charSequence, true, false);
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View view;
        View view2;
        int i10 = this.c;
        Context context = this.d;
        switch (i10) {
            case 0:
                if (i7 != 0) {
                    view = i7 != 2 ? i7 != 3 ? (i7 == 4 || i7 == 5) ? new org.telegram.ui.Cells.w9(context) : i7 != 6 ? new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.c0) null) : new org.telegram.ui.Cells.z8(context) : new org.telegram.ui.Cells.n4(context) : new org.telegram.ui.Cells.r8(context);
                } else {
                    org.telegram.ui.Cells.b9 b9Var = new org.telegram.ui.Cells.b9(context);
                    b9Var.e = 50;
                    b9Var.r = 21;
                    TextView textView = new TextView(context);
                    b9Var.a = textView;
                    org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.G6, null);
                    org.telegram.messenger.n10.q(textView, 1, 16.0f, 1, 1);
                    textView.setSingleLine(true);
                    textView.setGravity((org.telegram.messenger.gd.a0 ? 5 : 3) | 16);
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    textView.setEllipsize(truncateAt);
                    boolean z10 = org.telegram.messenger.gd.a0;
                    b9Var.addView(textView, c8.ma.d(-1, -1.0f, (z10 ? 5 : 3) | 48, z10 ? 21 : 64.0f, 0.0f, z10 ? 64.0f : 21, 0.0f));
                    TextView textView2 = new TextView(context);
                    b9Var.b = textView2;
                    org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.z6, null);
                    textView2.setTextSize(1, 13.0f);
                    textView2.setGravity(org.telegram.messenger.gd.a0 ? 5 : 3);
                    textView2.setLines(1);
                    textView2.setMaxLines(1);
                    textView2.setSingleLine(true);
                    textView2.setPadding(0, 0, 0, 0);
                    textView2.setEllipsize(truncateAt);
                    boolean z11 = org.telegram.messenger.gd.a0;
                    b9Var.addView(textView2, c8.ma.d(-2, -2.0f, (z11 ? 5 : 3) | 48, z11 ? 21 : 64.0f, 36.0f, z11 ? 64.0f : 21, 0.0f));
                    RadioButton radioButton = new RadioButton(context);
                    b9Var.c = radioButton;
                    radioButton.setSize(org.telegram.messenger.g0.L(20.0f));
                    org.telegram.ui.ActionBar.u6.O(radioButton, org.telegram.ui.ActionBar.n6.g7, org.telegram.ui.ActionBar.n6.h7, null);
                    b9Var.addView(radioButton, c8.ma.d(20, 20.0f, (org.telegram.messenger.gd.a0 ? 5 : 3) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
                    b9Var.n = org.telegram.messenger.gd.a0;
                    b9Var.setClipChildren(false);
                    view = b9Var;
                }
                return new org.telegram.ui.Components.kj0(view);
            default:
                if (i7 == 0) {
                    view2 = new org.telegram.ui.Cells.s8(context);
                } else if (i7 != 2) {
                    view2 = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.c0) null);
                } else {
                    org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context);
                    n4Var.setText(org.telegram.messenger.gd.M0(2131752113, null));
                    view2 = n4Var;
                }
                return new org.telegram.ui.Components.kj0(view2);
        }
    }

    @Override // v4.i0
    public void y(v4.f1 f1Var) {
        switch (this.c) {
            case 0:
                View view = f1Var.a;
                if (view instanceof org.telegram.ui.Cells.b9) {
                    ((org.telegram.ui.Cells.b9) view).c();
                    break;
                }
                break;
        }
    }
}
