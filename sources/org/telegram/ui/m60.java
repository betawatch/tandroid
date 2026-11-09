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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class m60 extends org.telegram.ui.Components.pj0 {
    public final /* synthetic */ int c;
    public final Context d;
    public final boolean e;
    public final /* synthetic */ org.telegram.ui.ActionBar.f2 f;

    public /* synthetic */ m60(org.telegram.ui.ActionBar.f2 f2Var, Context context, boolean z9, int i7) {
        this.c = i7;
        this.f = f2Var;
        this.d = context;
        this.e = z9;
    }

    @Override // org.telegram.ui.Components.pj0
    public final boolean D(v4.d1 d1Var) {
        switch (this.c) {
            case 0:
                int i7 = d1Var.f;
                return i7 == 0 || i7 == 4 || i7 == 5 || i7 == 2;
            default:
                return d1Var.f == 0;
        }
    }

    @Override // v4.g0
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
                if (languageSelectActivity.getMessagesController().H2() || languageSelectActivity.getMessagesController().G2()) {
                    int i10 = languageSelectActivity.getMessagesController().H2() ? 3 : 2;
                    if (languageSelectActivity.getMessagesController().G2() && !languageSelectActivity.getMessagesController().D3()) {
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
                ty0 ty0Var = (ty0) this.f;
                if (!this.e) {
                    return (ty0Var.e >= 0 ? 1 : 0) + ty0Var.h.size();
                }
                ArrayList arrayList2 = ty0Var.f;
                if (arrayList2 == null) {
                    return 0;
                }
                return arrayList2.size();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00bd, code lost:
    
        if (r1 != ((r0.f.size() + r0.h.size()) + 1)) goto L61;
     */
    @Override // v4.g0
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
                if (languageSelectActivity.getMessagesController().H2() || languageSelectActivity.getMessagesController().G2()) {
                    int i12 = i7 - 1;
                    if (i7 != 0) {
                        i10 = 2;
                        if (languageSelectActivity.getMessagesController().H2()) {
                            int i13 = i7 - 2;
                            if (i12 == 0) {
                                languageSelectActivity.manualTranslationPosition = i7;
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
                return (!this.e && i7 == ((ty0) this.f).e) ? 1 : 0;
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
    @Override // v4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.d1 d1Var, int i7) {
        org.telegram.messenger.fd fdVar;
        boolean z9;
        int i10;
        int i11;
        String sb2;
        boolean z10;
        int i12 = i7;
        int i13 = this.c;
        boolean z11 = this.e;
        CharSequence charSequence = null;
        r5 = null;
        r5 = null;
        r5 = null;
        org.telegram.messenger.y00 y00Var = null;
        charSequence = null;
        org.telegram.ui.ActionBar.f2 f2Var = this.f;
        switch (i13) {
            case 0:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) f2Var;
                int i14 = d1Var.f;
                View view = d1Var.a;
                if (i14 == 0) {
                    if (!z11) {
                        i12 -= languageSelectActivity.r;
                    }
                    org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
                    b9Var.c();
                    if (!z11) {
                        if (!languageSelectActivity.h.isEmpty() && i12 >= 0 && i12 < languageSelectActivity.h.size()) {
                            fdVar = (org.telegram.messenger.fd) languageSelectActivity.h.get(i12);
                            break;
                        } else {
                            if (!languageSelectActivity.h.isEmpty()) {
                                i12 = jg.g.g(1, i12, languageSelectActivity.h);
                            }
                            fdVar = (i12 < 0 || i12 >= languageSelectActivity.f.size()) ? null : (org.telegram.messenger.fd) languageSelectActivity.f.get(i12);
                            break;
                        }
                    } else {
                        fdVar = (i12 < 0 || i12 >= languageSelectActivity.e.size()) ? null : (org.telegram.messenger.fd) languageSelectActivity.e.get(i12);
                        break;
                    }
                    if (fdVar != null) {
                        if (fdVar.h()) {
                            b9Var.b(String.format("%1$s (%2$s)", fdVar.a, org.telegram.messenger.id.M0(2131749051, null)), fdVar.b, !z9);
                        } else {
                            b9Var.b(fdVar.a, fdVar.b, !z9);
                        }
                    }
                    b9Var.setChecked(fdVar == org.telegram.messenger.id.E0().B);
                    break;
                } else {
                    if (i14 == 2) {
                        org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                        View view2 = r8Var.e;
                        TextView textView = r8Var.d;
                        TextView textView2 = r8Var.c;
                        boolean z12 = r8Var.H;
                        boolean z13 = org.telegram.messenger.id.a0;
                        if (z12 != z13) {
                            r8Var.H = z13;
                            textView2.setGravity((z13 ? 5 : 3) | 16);
                            r8Var.removeView(textView2);
                            boolean z14 = org.telegram.messenger.id.a0;
                            r8Var.addView(textView2, c8.ha.d(-1, -1.0f, (z14 ? 5 : 3) | 48, z14 ? 70.0f : r8Var.E, 0.0f, z14 ? r8Var.E : 70.0f, 0.0f));
                            textView.setGravity(org.telegram.messenger.id.a0 ? 5 : 3);
                            r8Var.removeView(textView);
                            boolean z15 = org.telegram.messenger.id.a0;
                            r8Var.addView(textView, c8.ha.d(-2, -2.0f, (z15 ? 5 : 3) | 48, z15 ? 64.0f : r8Var.E, 36.0f, z15 ? r8Var.E : 64.0f, 0.0f));
                            r8Var.removeView(view2);
                            r8Var.addView(view2, c8.ha.d(37, 20.0f, (org.telegram.messenger.id.a0 ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
                        }
                        i10 = languageSelectActivity.manualTranslationPosition;
                        if (i12 != i10) {
                            i11 = languageSelectActivity.autoTranslationPosition;
                            if (i12 == i11) {
                                CharSequence M0 = org.telegram.messenger.id.M0(2131745326, null);
                                boolean k02 = languageSelectActivity.k0();
                                if (!languageSelectActivity.l0() && !languageSelectActivity.k0()) {
                                    r7 = false;
                                }
                                r8Var.f(M0, k02, r7);
                                r8Var.setCheckBoxIcon(languageSelectActivity.getUserConfig().q() ? 0 : R.drawable.permission_locked);
                                break;
                            }
                        } else {
                            r8Var.f(org.telegram.messenger.id.M0(2131745327, null), languageSelectActivity.l0(), true);
                            r8Var.setCheckBoxIcon(0);
                            break;
                        }
                    } else if (i14 == 3) {
                        ((org.telegram.ui.Cells.n4) view).setText(org.telegram.messenger.id.M0((i12 == 0 && (languageSelectActivity.getMessagesController().H2() || languageSelectActivity.getMessagesController().G2())) ? 2131743955 : 2131749054, null));
                        break;
                    } else if (i14 == 4) {
                        org.telegram.ui.Cells.w9 w9Var = (org.telegram.ui.Cells.w9) view;
                        w9Var.d();
                        HashSet d02 = ty0.d0();
                        String M02 = org.telegram.messenger.id.M0(2131751358, null);
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
                                        String K0 = org.telegram.ui.Components.l21.K0(org.telegram.ui.Components.l21.O0(str, zArr, null));
                                        if (K0 != null) {
                                            sb3.append(K0);
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
                                    charSequence = org.telegram.ui.Components.l21.K0(org.telegram.ui.Components.l21.O0((String) d02.iterator().next(), zArr, null));
                                }
                            } else {
                                charSequence = "";
                            }
                        } catch (Exception unused2) {
                        }
                        if (charSequence == null) {
                            charSequence = String.format(org.telegram.messenger.id.K0(d02.size(), "Languages"), Integer.valueOf(d02.size()));
                        }
                        w9Var.c(M02, charSequence, true, false);
                        break;
                    } else if (i14 == 5) {
                        ((org.telegram.ui.Cells.w9) view).d();
                        break;
                    } else if (i14 == 6) {
                        org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
                        org.telegram.ui.Cells.b2 b2Var = z8Var.a;
                        boolean z16 = z8Var.n;
                        boolean z17 = org.telegram.messenger.id.a0;
                        if (z16 != z17) {
                            z8Var.n = z17;
                            b2Var.setGravity(z17 ? 5 : 3);
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) b2Var.getLayoutParams();
                            layoutParams.gravity = (org.telegram.messenger.id.a0 ? 5 : 3) | 48;
                            b2Var.setLayoutParams(layoutParams);
                        }
                        if (i12 != languageSelectActivity.n) {
                            z8Var.setTopPadding(0);
                            z8Var.setBottomPadding(16);
                            break;
                        } else {
                            z8Var.setText(org.telegram.messenger.id.M0(2131743954, null));
                            z8Var.setTopPadding(11);
                            z8Var.setBottomPadding(16);
                            break;
                        }
                    }
                }
                break;
            default:
                ty0 ty0Var = (ty0) f2Var;
                int i15 = d1Var.f;
                View view3 = d1Var.a;
                if (i15 == 0) {
                    org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view3;
                    if (z11) {
                        if (i12 >= 0 && i12 < ty0Var.f.size()) {
                            y00Var = (org.telegram.messenger.y00) ty0Var.f.get(i12);
                        }
                        break;
                    } else {
                        int i16 = ty0Var.e;
                        if (i16 >= 0 && i12 > i16) {
                            i12--;
                        }
                        if (i12 >= 0 && i12 < ty0Var.h.size()) {
                            y00Var = (org.telegram.messenger.y00) ty0Var.h.get(i12);
                            break;
                        }
                        z10 = false;
                    }
                    if (y00Var != null) {
                        String str2 = y00Var.c;
                        if (str2 == null) {
                            str2 = y00Var.b;
                        }
                        s8Var.b(str2, y00Var.b, false, !z10);
                        s8Var.setChecked(ty0Var.r.contains(y00Var.a));
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

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View view;
        View view2;
        int i10 = this.c;
        Context context = this.d;
        switch (i10) {
            case 0:
                if (i7 != 0) {
                    view = i7 != 2 ? i7 != 3 ? (i7 == 4 || i7 == 5) ? new org.telegram.ui.Cells.w9(context) : i7 != 6 ? new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.f1) null) : new org.telegram.ui.Cells.z8(context) : new org.telegram.ui.Cells.n4(context) : new org.telegram.ui.Cells.r8(context);
                } else {
                    org.telegram.ui.Cells.b9 b9Var = new org.telegram.ui.Cells.b9(context);
                    b9Var.e = 50;
                    b9Var.r = 21;
                    TextView textView = new TextView(context);
                    b9Var.a = textView;
                    org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.G6, null);
                    org.telegram.messenger.camera.q.n(textView, 1, 16.0f, 1, 1);
                    textView.setSingleLine(true);
                    textView.setGravity((org.telegram.messenger.id.a0 ? 5 : 3) | 16);
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    textView.setEllipsize(truncateAt);
                    boolean z9 = org.telegram.messenger.id.a0;
                    b9Var.addView(textView, c8.ha.d(-1, -1.0f, (z9 ? 5 : 3) | 48, z9 ? 21 : 64.0f, 0.0f, z9 ? 64.0f : 21, 0.0f));
                    TextView textView2 = new TextView(context);
                    b9Var.b = textView2;
                    org.telegram.ui.ActionBar.s6.U(textView2, org.telegram.ui.ActionBar.l6.z6, null);
                    textView2.setTextSize(1, 13.0f);
                    textView2.setGravity(org.telegram.messenger.id.a0 ? 5 : 3);
                    textView2.setLines(1);
                    textView2.setMaxLines(1);
                    textView2.setSingleLine(true);
                    textView2.setPadding(0, 0, 0, 0);
                    textView2.setEllipsize(truncateAt);
                    boolean z10 = org.telegram.messenger.id.a0;
                    b9Var.addView(textView2, c8.ha.d(-2, -2.0f, (z10 ? 5 : 3) | 48, z10 ? 21 : 64.0f, 36.0f, z10 ? 64.0f : 21, 0.0f));
                    RadioButton radioButton = new RadioButton(context);
                    b9Var.c = radioButton;
                    radioButton.setSize(org.telegram.messenger.g0.L(20.0f));
                    org.telegram.ui.ActionBar.s6.O(radioButton, org.telegram.ui.ActionBar.l6.g7, org.telegram.ui.ActionBar.l6.h7, null);
                    b9Var.addView(radioButton, c8.ha.d(20, 20.0f, (org.telegram.messenger.id.a0 ? 5 : 3) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
                    b9Var.n = org.telegram.messenger.id.a0;
                    b9Var.setClipChildren(false);
                    view = b9Var;
                }
                return new org.telegram.ui.Components.yi0(view);
            default:
                if (i7 == 0) {
                    view2 = new org.telegram.ui.Cells.s8(context);
                } else if (i7 != 2) {
                    view2 = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.f1) null);
                } else {
                    org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context);
                    n4Var.setText(org.telegram.messenger.id.M0(2131752124, null));
                    view2 = n4Var;
                }
                return new org.telegram.ui.Components.yi0(view2);
        }
    }

    @Override // v4.g0
    public void y(v4.d1 d1Var) {
        switch (this.c) {
            case 0:
                View view = d1Var.a;
                if (view instanceof org.telegram.ui.Cells.b9) {
                    ((org.telegram.ui.Cells.b9) view).c();
                    break;
                }
                break;
        }
    }
}
