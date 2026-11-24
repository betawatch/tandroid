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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ix5 extends n39 {
    public final /* synthetic */ byte c;
    public final Context d;
    public final boolean e;
    public final /* synthetic */ d f;

    public /* synthetic */ ix5(d dVar, Context context, boolean z, byte b) {
        this.c = b;
        this.f = dVar;
        this.d = context;
        this.e = z;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        switch (this.c) {
            case 0:
                int i = s49Var.f;
                if (i == 0 || i == 4 || i == 5 || i == 2) {
                    break;
                }
                break;
            default:
                if (s49Var.f == 0) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // w39
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
                if (languageSelectActivity.getMessagesController().G2() || languageSelectActivity.getMessagesController().F2()) {
                    int i2 = languageSelectActivity.getMessagesController().G2() ? 3 : 2;
                    if (languageSelectActivity.getMessagesController().F2() && !languageSelectActivity.getMessagesController().E3()) {
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
                qa9 qa9Var = (qa9) dVar;
                if (!z) {
                    return qa9Var.h.size() + (qa9Var.e < 0 ? 0 : 1);
                }
                ArrayList arrayList2 = qa9Var.f;
                if (arrayList2 != null) {
                    return arrayList2.size();
                }
                return 0;
        }
    }

    @Override // w39
    public final int d(int i) {
        int i2;
        byte b = this.c;
        d dVar = this.f;
        boolean z = this.e;
        switch (b) {
            case 0:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) dVar;
                if (!z) {
                    if (languageSelectActivity.getMessagesController().G2() || languageSelectActivity.getMessagesController().F2()) {
                        int i3 = i - 1;
                        if (i != 0) {
                            if (languageSelectActivity.getMessagesController().G2()) {
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
                            if (!languageSelectActivity.getMessagesController().F2() || languageSelectActivity.getMessagesController().E3()) {
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
                if (z || i != ((qa9) dVar).e) {
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
    
        if (r4 <= java.lang.Math.min((r8.x - gl.L(34.0f)) / 2.0f, (r8.x - gl.L(84.0f)) - r1.getTextView().getPaint().measureText(r2))) goto L79;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0189  */
    @Override // w39
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(s49 s49Var, int i) {
        i96 i96Var;
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
        u0c u0cVar = null;
        charSequence = null;
        d dVar = this.f;
        switch (b) {
            case 0:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) dVar;
                int i5 = s49Var.f;
                View view = s49Var.a;
                if (i5 == 0) {
                    if (!z3) {
                        i4 -= languageSelectActivity.r;
                    }
                    yhb yhbVar = (yhb) view;
                    yhbVar.c();
                    if (!z3) {
                        if (!languageSelectActivity.h.isEmpty() && i4 >= 0 && i4 < languageSelectActivity.h.size()) {
                            i96Var = (i96) languageSelectActivity.h.get(i4);
                            break;
                        } else {
                            if (!languageSelectActivity.h.isEmpty()) {
                                i4 = ir2.k(1, i4, languageSelectActivity.h);
                            }
                            i96Var = (i4 < 0 || i4 >= languageSelectActivity.f.size()) ? null : (i96) languageSelectActivity.f.get(i4);
                            break;
                        }
                    } else {
                        i96Var = (i4 < 0 || i4 >= languageSelectActivity.e.size()) ? null : (i96) languageSelectActivity.e.get(i4);
                        break;
                    }
                    if (i96Var != null) {
                        boolean h = i96Var.h();
                        String str = i96Var.a;
                        if (h) {
                            yhbVar.b(String.format("%1$s (%2$s)", str, k96.M0(2131748859, null)), i96Var.b, !z);
                        } else {
                            yhbVar.b(str, i96Var.b, !z);
                        }
                    }
                    yhbVar.setChecked(i96Var == k96.D0().B);
                    break;
                } else {
                    if (i5 == 2) {
                        ahb ahbVar = (ahb) view;
                        View view2 = ahbVar.e;
                        TextView textView = ahbVar.d;
                        TextView textView2 = ahbVar.c;
                        boolean z4 = ahbVar.I;
                        boolean z5 = k96.a0;
                        if (z4 != z5) {
                            ahbVar.I = z5;
                            textView2.setGravity((z5 ? 5 : 3) | 16);
                            ahbVar.removeView(textView2);
                            boolean z6 = k96.a0;
                            ahbVar.addView(textView2, nme.d(-1, -1.0f, (z6 ? 5 : 3) | 48, z6 ? 70.0f : ahbVar.F, 0.0f, z6 ? ahbVar.F : 70.0f, 0.0f));
                            textView.setGravity(k96.a0 ? 5 : 3);
                            ahbVar.removeView(textView);
                            boolean z7 = k96.a0;
                            ahbVar.addView(textView, nme.d(-2, -2.0f, (z7 ? 5 : 3) | 48, z7 ? 64.0f : ahbVar.F, 36.0f, z7 ? ahbVar.F : 64.0f, 0.0f));
                            ahbVar.removeView(view2);
                            ahbVar.addView(view2, nme.d(37, 20.0f, (k96.a0 ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
                        }
                        i2 = languageSelectActivity.manualTranslationPosition;
                        if (i4 != i2) {
                            i3 = languageSelectActivity.autoTranslationPosition;
                            if (i4 == i3) {
                                CharSequence M0 = k96.M0(2131745134, null);
                                boolean e0 = languageSelectActivity.e0();
                                if (!languageSelectActivity.f0() && !languageSelectActivity.e0()) {
                                    r6 = false;
                                }
                                ahbVar.f(M0, e0, r6);
                                ahbVar.setCheckBoxIcon(languageSelectActivity.getUserConfig().p() ? 0 : R.drawable.permission_locked);
                                break;
                            }
                        } else {
                            ahbVar.f(k96.M0(2131745135, null), languageSelectActivity.f0(), true);
                            ahbVar.setCheckBoxIcon(0);
                            break;
                        }
                    } else if (i5 == 3) {
                        ((ld5) view).setText(k96.M0((i4 == 0 && (languageSelectActivity.getMessagesController().G2() || languageSelectActivity.getMessagesController().F2())) ? 2131743716 : 2131748862, null));
                        break;
                    } else if (i5 == 4) {
                        uib uibVar = (uib) view;
                        uibVar.d();
                        HashSet b0 = qa9.b0();
                        String M02 = k96.M0(2131751346, null);
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
                                        String E0 = rzb.E0(rzb.J0(str2, zArr, null));
                                        if (E0 != null) {
                                            sb2.append(E0);
                                            objArr = false;
                                        }
                                    }
                                    sb = sb2.toString();
                                    try {
                                        float measureText = uibVar.getValueTextView().getPaint().measureText(sb);
                                        Point point = gl.q;
                                        break;
                                    } catch (Exception unused) {
                                        break;
                                    }
                                } else {
                                    charSequence = rzb.E0(rzb.J0((String) b0.iterator().next(), zArr, null));
                                }
                            } else {
                                charSequence = "";
                            }
                        } catch (Exception unused2) {
                        }
                        if (charSequence == null) {
                            charSequence = String.format(k96.J0(b0.size(), "Languages"), Integer.valueOf(b0.size()));
                        }
                        uibVar.c(M02, charSequence, true, false);
                        break;
                    } else if (i5 == 5) {
                        ((uib) view).d();
                        break;
                    } else if (i5 == 6) {
                        mhb mhbVar = (mhb) view;
                        ke1 ke1Var = mhbVar.a;
                        boolean z8 = mhbVar.n;
                        boolean z9 = k96.a0;
                        if (z8 != z9) {
                            mhbVar.n = z9;
                            ke1Var.setGravity(z9 ? 5 : 3);
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ke1Var.getLayoutParams();
                            layoutParams.gravity = (k96.a0 ? 5 : 3) | 48;
                            ke1Var.setLayoutParams(layoutParams);
                        }
                        if (i4 != languageSelectActivity.n) {
                            mhbVar.setTopPadding(0);
                            mhbVar.setBottomPadding(16);
                            break;
                        } else {
                            mhbVar.setText(k96.M0(2131743715, null));
                            mhbVar.setTopPadding(11);
                            mhbVar.setBottomPadding(16);
                            break;
                        }
                    }
                }
                break;
            default:
                qa9 qa9Var = (qa9) dVar;
                int i6 = s49Var.f;
                View view3 = s49Var.a;
                if (i6 == 0) {
                    bhb bhbVar = (bhb) view3;
                    if (z3) {
                        if (i4 >= 0 && i4 < qa9Var.f.size()) {
                            u0cVar = (u0c) qa9Var.f.get(i4);
                        }
                        break;
                    } else {
                        int i7 = qa9Var.e;
                        if (i7 >= 0 && i4 > i7) {
                            i4--;
                        }
                        if (i4 >= 0 && i4 < qa9Var.h.size()) {
                            u0cVar = (u0c) qa9Var.h.get(i4);
                            break;
                        }
                        z2 = false;
                    }
                    if (u0cVar != null) {
                        String str3 = u0cVar.c;
                        if (str3 == null) {
                            str3 = u0cVar.b;
                        }
                        bhbVar.b(str3, u0cVar.b, false, !z2);
                        bhbVar.setChecked(qa9Var.r.contains(u0cVar.a));
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
        uibVar.c(M02, charSequence, true, false);
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        View view;
        View view2;
        byte b = this.c;
        Context context = this.d;
        switch (b) {
            case 0:
                if (i != 0) {
                    view = i != 2 ? i != 3 ? (i == 4 || i == 5) ? new uib(context) : i != 6 ? new b9a(context, (de9) null) : new mhb(context) : new ld5(context) : new ahb(context);
                } else {
                    yhb yhbVar = new yhb(context);
                    yhbVar.e = 50;
                    yhbVar.n = (byte) 21;
                    TextView textView = new TextView(context);
                    yhbVar.a = textView;
                    zkb.X(textView, bkb.F6, null);
                    ug8.w(textView, 1, 16.0f, 1, 1);
                    textView.setSingleLine(true);
                    textView.setGravity((k96.a0 ? 5 : 3) | 16);
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    textView.setEllipsize(truncateAt);
                    boolean z = k96.a0;
                    yhbVar.addView(textView, nme.d(-1, -1.0f, (z ? 5 : 3) | 48, z ? 21.0f : 64.0f, 0.0f, z ? 64.0f : 21.0f, 0.0f));
                    TextView textView2 = new TextView(context);
                    yhbVar.b = textView2;
                    zkb.X(textView2, bkb.y6, null);
                    textView2.setTextSize(1, 13.0f);
                    textView2.setGravity(k96.a0 ? 5 : 3);
                    textView2.setLines(1);
                    textView2.setMaxLines(1);
                    textView2.setSingleLine(true);
                    textView2.setPadding(0, 0, 0, 0);
                    textView2.setEllipsize(truncateAt);
                    boolean z2 = k96.a0;
                    yhbVar.addView(textView2, nme.d(-2, -2.0f, (z2 ? 5 : 3) | 48, z2 ? 21.0f : 64.0f, 36.0f, z2 ? 64.0f : 21.0f, 0.0f));
                    RadioButton radioButton = new RadioButton(context);
                    yhbVar.c = radioButton;
                    radioButton.setSize(gl.L(20.0f));
                    zkb.O(radioButton, bkb.f7, bkb.g7, null);
                    yhbVar.addView(radioButton, nme.d(20, 20.0f, (k96.a0 ? 5 : 3) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
                    yhbVar.h = k96.a0;
                    yhbVar.setClipChildren(false);
                    view = yhbVar;
                }
                return new y29(view);
            default:
                if (i == 0) {
                    view2 = new bhb(context);
                } else if (i != 2) {
                    view2 = new b9a(context, (de9) null);
                } else {
                    ld5 ld5Var = new ld5(context);
                    ld5Var.setText(k96.M0(2131752112, null));
                    view2 = ld5Var;
                }
                return new y29(view2);
        }
    }

    @Override // w39
    public final void y(s49 s49Var) {
        switch (this.c) {
            case 0:
                View view = s49Var.a;
                if (view instanceof yhb) {
                    ((yhb) view).c();
                    break;
                }
                break;
        }
    }
}
