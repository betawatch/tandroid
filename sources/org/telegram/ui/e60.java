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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class e60 extends org.telegram.ui.Components.sj0 {
    public final /* synthetic */ int c;
    public final Context d;
    public final boolean e;
    public final /* synthetic */ org.telegram.ui.ActionBar.d2 f;

    public /* synthetic */ e60(org.telegram.ui.ActionBar.d2 d2Var, Context context, boolean z10, int i3) {
        this.c = i3;
        this.f = d2Var;
        this.d = context;
        this.e = z10;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        switch (this.c) {
            case 0:
                int i3 = d1Var.f;
                return i3 == 0 || i3 == 4 || i3 == 5 || i3 == 2;
            default:
                return d1Var.f == 0;
        }
    }

    @Override // u4.h0
    public final int b() {
        int i3;
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
                if (languageSelectActivity.getMessagesController().H2() || languageSelectActivity.getMessagesController().G2()) {
                    int i10 = languageSelectActivity.getMessagesController().H2() ? 3 : 2;
                    if (languageSelectActivity.getMessagesController().G2() && !languageSelectActivity.getMessagesController().D3()) {
                        i10++;
                    }
                    if (languageSelectActivity.k0() || languageSelectActivity.l0()) {
                        i10++;
                    }
                    i3 = i10 + 1;
                } else {
                    i3 = 1;
                }
                int size = i3 + 1 + languageSelectActivity.f.size();
                return !languageSelectActivity.h.isEmpty() ? languageSelectActivity.h.size() + 1 + size : size;
            default:
                gy0 gy0Var = (gy0) this.f;
                if (!this.e) {
                    return (gy0Var.e >= 0 ? 1 : 0) + gy0Var.h.size();
                }
                ArrayList arrayList2 = gy0Var.f;
                if (arrayList2 == null) {
                    return 0;
                }
                return arrayList2.size();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00bd, code lost:
    
        if (r1 != ((r0.f.size() + r0.h.size()) + 1)) goto L61;
     */
    @Override // u4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int d(int i3) {
        int i10;
        int i11;
        switch (this.c) {
            case 0:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.f;
                if (this.e) {
                    return 0;
                }
                if (languageSelectActivity.getMessagesController().H2() || languageSelectActivity.getMessagesController().G2()) {
                    int i12 = i3 - 1;
                    if (i3 != 0) {
                        i10 = 2;
                        if (languageSelectActivity.getMessagesController().H2()) {
                            int i13 = i3 - 2;
                            if (i12 == 0) {
                                languageSelectActivity.manualTranslationPosition = i3;
                                return i10;
                            }
                            i12 = i13;
                        } else {
                            languageSelectActivity.manualTranslationPosition = -1;
                        }
                        if (!languageSelectActivity.getMessagesController().G2() || languageSelectActivity.getMessagesController().D3()) {
                            languageSelectActivity.autoTranslationPosition = -1;
                        } else {
                            int i14 = i12 - 1;
                            if (i12 == 0) {
                                languageSelectActivity.autoTranslationPosition = i3;
                                return i10;
                            }
                            i12 = i14;
                        }
                        if (languageSelectActivity.k0() || languageSelectActivity.l0()) {
                            languageSelectActivity.doNotTranslatePosition = i3;
                            int i15 = i12 - 1;
                            if (i12 == 0) {
                                return 4;
                            }
                            i12 = i15;
                        }
                        i11 = i12 - 1;
                        if (i12 == 0) {
                            languageSelectActivity.n = i3;
                            return 6;
                        }
                    }
                    return 3;
                }
                i11 = i3;
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
                        languageSelectActivity.r = i3 - i16;
                        return 0;
                    }
                    return i10;
                }
                return 3;
            default:
                return (!this.e && i3 == ((gy0) this.f).e) ? 1 : 0;
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
    @Override // u4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(u4.d1 d1Var, int i3) {
        org.telegram.messenger.yc ycVar;
        boolean z10;
        int i10;
        int i11;
        String sb2;
        boolean z11;
        int i12 = i3;
        int i13 = this.c;
        boolean z12 = this.e;
        CharSequence charSequence = null;
        r5 = null;
        r5 = null;
        r5 = null;
        org.telegram.messenger.q00 q00Var = null;
        charSequence = null;
        org.telegram.ui.ActionBar.d2 d2Var = this.f;
        switch (i13) {
            case 0:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) d2Var;
                int i14 = d1Var.f;
                View view = d1Var.a;
                if (i14 == 0) {
                    if (!z12) {
                        i12 -= languageSelectActivity.r;
                    }
                    org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
                    a9Var.c();
                    if (!z12) {
                        if (!languageSelectActivity.h.isEmpty() && i12 >= 0 && i12 < languageSelectActivity.h.size()) {
                            ycVar = (org.telegram.messenger.yc) languageSelectActivity.h.get(i12);
                            break;
                        } else {
                            if (!languageSelectActivity.h.isEmpty()) {
                                i12 = k2.p1.f(1, i12, languageSelectActivity.h);
                            }
                            ycVar = (i12 < 0 || i12 >= languageSelectActivity.f.size()) ? null : (org.telegram.messenger.yc) languageSelectActivity.f.get(i12);
                            break;
                        }
                    } else {
                        ycVar = (i12 < 0 || i12 >= languageSelectActivity.e.size()) ? null : (org.telegram.messenger.yc) languageSelectActivity.e.get(i12);
                        break;
                    }
                    if (ycVar != null) {
                        if (ycVar.h()) {
                            a9Var.b(String.format("%1$s (%2$s)", ycVar.a, org.telegram.messenger.bd.M0(2131749059, null)), ycVar.b, !z10);
                        } else {
                            a9Var.b(ycVar.a, ycVar.b, !z10);
                        }
                    }
                    a9Var.setChecked(ycVar == org.telegram.messenger.bd.E0().B);
                    break;
                } else {
                    if (i14 == 2) {
                        org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                        View view2 = q8Var.e;
                        TextView textView = q8Var.d;
                        TextView textView2 = q8Var.c;
                        boolean z13 = q8Var.I;
                        boolean z14 = org.telegram.messenger.bd.a0;
                        if (z13 != z14) {
                            q8Var.I = z14;
                            textView2.setGravity((z14 ? 5 : 3) | 16);
                            q8Var.removeView(textView2);
                            boolean z15 = org.telegram.messenger.bd.a0;
                            q8Var.addView(textView2, b8.mf.d(-1, -1.0f, (z15 ? 5 : 3) | 48, z15 ? 70.0f : q8Var.F, 0.0f, z15 ? q8Var.F : 70.0f, 0.0f));
                            textView.setGravity(org.telegram.messenger.bd.a0 ? 5 : 3);
                            q8Var.removeView(textView);
                            boolean z16 = org.telegram.messenger.bd.a0;
                            q8Var.addView(textView, b8.mf.d(-2, -2.0f, (z16 ? 5 : 3) | 48, z16 ? 64.0f : q8Var.F, 36.0f, z16 ? q8Var.F : 64.0f, 0.0f));
                            q8Var.removeView(view2);
                            q8Var.addView(view2, b8.mf.d(37, 20.0f, (org.telegram.messenger.bd.a0 ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
                        }
                        i10 = languageSelectActivity.manualTranslationPosition;
                        if (i12 != i10) {
                            i11 = languageSelectActivity.autoTranslationPosition;
                            if (i12 == i11) {
                                CharSequence M0 = org.telegram.messenger.bd.M0(2131745336, null);
                                boolean k02 = languageSelectActivity.k0();
                                if (!languageSelectActivity.l0() && !languageSelectActivity.k0()) {
                                    r7 = false;
                                }
                                q8Var.f(M0, k02, r7);
                                q8Var.setCheckBoxIcon(languageSelectActivity.getUserConfig().q() ? 0 : R.drawable.permission_locked);
                                break;
                            }
                        } else {
                            q8Var.f(org.telegram.messenger.bd.M0(2131745337, null), languageSelectActivity.l0(), true);
                            q8Var.setCheckBoxIcon(0);
                            break;
                        }
                    } else if (i14 == 3) {
                        ((org.telegram.ui.Cells.n4) view).setText(org.telegram.messenger.bd.M0((i12 == 0 && (languageSelectActivity.getMessagesController().H2() || languageSelectActivity.getMessagesController().G2())) ? 2131743965 : 2131749062, null));
                        break;
                    } else if (i14 == 4) {
                        org.telegram.ui.Cells.v9 v9Var = (org.telegram.ui.Cells.v9) view;
                        v9Var.d();
                        HashSet d02 = gy0.d0();
                        String M02 = org.telegram.messenger.bd.M0(2131751359, null);
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
                                        String K0 = org.telegram.ui.Components.f21.K0(org.telegram.ui.Components.f21.O0(str, zArr, null));
                                        if (K0 != null) {
                                            sb3.append(K0);
                                            objArr = false;
                                        }
                                    }
                                    sb2 = sb3.toString();
                                    try {
                                        float measureText = v9Var.getValueTextView().getPaint().measureText(sb2);
                                        Point point = org.telegram.messenger.g0.q;
                                        break;
                                    } catch (Exception unused) {
                                        break;
                                    }
                                } else {
                                    charSequence = org.telegram.ui.Components.f21.K0(org.telegram.ui.Components.f21.O0((String) d02.iterator().next(), zArr, null));
                                }
                            } else {
                                charSequence = "";
                            }
                        } catch (Exception unused2) {
                        }
                        if (charSequence == null) {
                            charSequence = String.format(org.telegram.messenger.bd.K0(d02.size(), "Languages"), Integer.valueOf(d02.size()));
                        }
                        v9Var.c(M02, charSequence, true, false);
                        break;
                    } else if (i14 == 5) {
                        ((org.telegram.ui.Cells.v9) view).d();
                        break;
                    } else if (i14 == 6) {
                        org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
                        org.telegram.ui.Cells.b2 b2Var = y8Var.a;
                        boolean z17 = y8Var.n;
                        boolean z18 = org.telegram.messenger.bd.a0;
                        if (z17 != z18) {
                            y8Var.n = z18;
                            b2Var.setGravity(z18 ? 5 : 3);
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) b2Var.getLayoutParams();
                            layoutParams.gravity = (org.telegram.messenger.bd.a0 ? 5 : 3) | 48;
                            b2Var.setLayoutParams(layoutParams);
                        }
                        if (i12 != languageSelectActivity.n) {
                            y8Var.setTopPadding(0);
                            y8Var.setBottomPadding(16);
                            break;
                        } else {
                            y8Var.setText(org.telegram.messenger.bd.M0(2131743964, null));
                            y8Var.setTopPadding(11);
                            y8Var.setBottomPadding(16);
                            break;
                        }
                    }
                }
                break;
            default:
                gy0 gy0Var = (gy0) d2Var;
                int i15 = d1Var.f;
                View view3 = d1Var.a;
                if (i15 == 0) {
                    org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view3;
                    if (z12) {
                        if (i12 >= 0 && i12 < gy0Var.f.size()) {
                            q00Var = (org.telegram.messenger.q00) gy0Var.f.get(i12);
                        }
                        break;
                    } else {
                        int i16 = gy0Var.e;
                        if (i16 >= 0 && i12 > i16) {
                            i12--;
                        }
                        if (i12 >= 0 && i12 < gy0Var.h.size()) {
                            q00Var = (org.telegram.messenger.q00) gy0Var.h.get(i12);
                            break;
                        }
                        z11 = false;
                    }
                    if (q00Var != null) {
                        String str2 = q00Var.c;
                        if (str2 == null) {
                            str2 = q00Var.b;
                        }
                        r8Var.b(str2, q00Var.b, false, !z11);
                        r8Var.setChecked(gy0Var.r.contains(q00Var.a));
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
        v9Var.c(M02, charSequence, true, false);
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View view;
        View view2;
        int i10 = this.c;
        Context context = this.d;
        switch (i10) {
            case 0:
                if (i3 != 0) {
                    view = i3 != 2 ? i3 != 3 ? (i3 == 4 || i3 == 5) ? new org.telegram.ui.Cells.v9(context) : i3 != 6 ? new org.telegram.ui.Cells.x6(context, (org.telegram.ui.Cells.f1) null) : new org.telegram.ui.Cells.y8(context) : new org.telegram.ui.Cells.n4(context) : new org.telegram.ui.Cells.q8(context);
                } else {
                    org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(context);
                    a9Var.e = 50;
                    a9Var.r = 21;
                    TextView textView = new TextView(context);
                    a9Var.a = textView;
                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, null);
                    org.telegram.messenger.camera.q.n(textView, 1, 16.0f, 1, 1);
                    textView.setSingleLine(true);
                    textView.setGravity((org.telegram.messenger.bd.a0 ? 5 : 3) | 16);
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    textView.setEllipsize(truncateAt);
                    boolean z10 = org.telegram.messenger.bd.a0;
                    a9Var.addView(textView, b8.mf.d(-1, -1.0f, (z10 ? 5 : 3) | 48, z10 ? 21 : 64.0f, 0.0f, z10 ? 64.0f : 21, 0.0f));
                    TextView textView2 = new TextView(context);
                    a9Var.b = textView2;
                    org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.z6, null);
                    textView2.setTextSize(1, 13.0f);
                    textView2.setGravity(org.telegram.messenger.bd.a0 ? 5 : 3);
                    textView2.setLines(1);
                    textView2.setMaxLines(1);
                    textView2.setSingleLine(true);
                    textView2.setPadding(0, 0, 0, 0);
                    textView2.setEllipsize(truncateAt);
                    boolean z11 = org.telegram.messenger.bd.a0;
                    a9Var.addView(textView2, b8.mf.d(-2, -2.0f, (z11 ? 5 : 3) | 48, z11 ? 21 : 64.0f, 36.0f, z11 ? 64.0f : 21, 0.0f));
                    RadioButton radioButton = new RadioButton(context);
                    a9Var.c = radioButton;
                    radioButton.setSize(org.telegram.messenger.g0.L(20.0f));
                    org.telegram.ui.ActionBar.r6.P(radioButton, org.telegram.ui.ActionBar.k6.g7, org.telegram.ui.ActionBar.k6.h7, null);
                    a9Var.addView(radioButton, b8.mf.d(20, 20.0f, (org.telegram.messenger.bd.a0 ? 5 : 3) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
                    a9Var.n = org.telegram.messenger.bd.a0;
                    a9Var.setClipChildren(false);
                    view = a9Var;
                }
                return new org.telegram.ui.Components.bj0(view);
            default:
                if (i3 == 0) {
                    view2 = new org.telegram.ui.Cells.r8(context);
                } else if (i3 != 2) {
                    view2 = new org.telegram.ui.Cells.x6(context, (org.telegram.ui.Cells.f1) null);
                } else {
                    org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context);
                    n4Var.setText(org.telegram.messenger.bd.M0(2131752124, null));
                    view2 = n4Var;
                }
                return new org.telegram.ui.Components.bj0(view2);
        }
    }

    @Override // u4.h0
    public void y(u4.d1 d1Var) {
        switch (this.c) {
            case 0:
                View view = d1Var.a;
                if (view instanceof org.telegram.ui.Cells.a9) {
                    ((org.telegram.ui.Cells.a9) view).c();
                    break;
                }
                break;
        }
    }
}
