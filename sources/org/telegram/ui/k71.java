package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class k71 extends org.telegram.ui.Components.vk0 {
    public final Context c;
    public final /* synthetic */ SessionsActivity d;

    public k71(SessionsActivity sessionsActivity, Context context) {
        this.d = sessionsActivity;
        this.c = context;
        C(true);
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        int i9;
        int i10;
        int b10 = q1Var.b();
        SessionsActivity sessionsActivity = this.d;
        i9 = sessionsActivity.terminateAllSessionsRow;
        if (b10 == i9) {
            return true;
        }
        if (b10 >= sessionsActivity.G && b10 < sessionsActivity.H) {
            return true;
        }
        if (b10 >= sessionsActivity.I && b10 < sessionsActivity.J) {
            return true;
        }
        if ((b10 >= sessionsActivity.C && b10 < sessionsActivity.D) || b10 == sessionsActivity.y) {
            return true;
        }
        i10 = sessionsActivity.ttlRow;
        return b10 == i10;
    }

    @Override // f2.r0
    public final int h() {
        return this.d.O;
    }

    @Override // f2.r0
    public final long i(int i9) {
        int i10;
        int i11;
        int hash;
        SessionsActivity sessionsActivity = this.d;
        i10 = sessionsActivity.terminateAllSessionsRow;
        if (i9 == i10) {
            hash = Objects.hash(0, 0);
        } else if (i9 == sessionsActivity.A) {
            hash = Objects.hash(0, 1);
        } else if (i9 == sessionsActivity.K) {
            hash = Objects.hash(0, 2);
        } else if (i9 == sessionsActivity.E) {
            hash = Objects.hash(0, 3);
        } else if (i9 == sessionsActivity.N) {
            hash = Objects.hash(0, 4);
        } else if (i9 == sessionsActivity.Q) {
            hash = Objects.hash(0, 5);
        } else if (i9 == sessionsActivity.L) {
            hash = Objects.hash(0, 6);
        } else if (i9 == sessionsActivity.x) {
            hash = Objects.hash(0, 7);
        } else if (i9 == sessionsActivity.F) {
            hash = Objects.hash(0, 8);
        } else if (i9 == sessionsActivity.B) {
            hash = Objects.hash(0, 9);
        } else if (i9 == sessionsActivity.P) {
            hash = Objects.hash(0, 10);
        } else if (i9 == sessionsActivity.y) {
            hash = Objects.hash(0, 11);
        } else {
            int i12 = sessionsActivity.G;
            if (i9 < i12 || i9 >= sessionsActivity.H) {
                int i13 = sessionsActivity.I;
                if (i9 < i13 || i9 >= sessionsActivity.J) {
                    int i14 = sessionsActivity.C;
                    if (i9 >= i14 && i9 < sessionsActivity.D) {
                        TLObject tLObject = (TLObject) sessionsActivity.f.get(i9 - i14);
                        if (tLObject instanceof TLRPC.TL_authorization) {
                            hash = Objects.hash(2, Long.valueOf(((TLRPC.TL_authorization) tLObject).hash));
                        } else {
                            if (tLObject instanceof TLRPC.TL_webAuthorization) {
                                hash = Objects.hash(2, Long.valueOf(((TLRPC.TL_webAuthorization) tLObject).hash));
                            }
                            hash = Objects.hash(0, -1);
                        }
                    } else if (i9 == sessionsActivity.M) {
                        hash = Objects.hash(0, 12);
                    } else {
                        i11 = sessionsActivity.ttlRow;
                        if (i9 == i11) {
                            hash = Objects.hash(0, 13);
                        }
                        hash = Objects.hash(0, -1);
                    }
                } else {
                    hash = Objects.hash(3, Long.valueOf(((TL_account.TL_connectedBot) sessionsActivity.h.get(i9 - i13)).bot_id));
                }
            } else {
                TLObject tLObject2 = (TLObject) sessionsActivity.e.get(i9 - i12);
                if (tLObject2 instanceof TLRPC.TL_authorization) {
                    hash = Objects.hash(1, Long.valueOf(((TLRPC.TL_authorization) tLObject2).hash));
                } else {
                    if (tLObject2 instanceof TLRPC.TL_webAuthorization) {
                        hash = Objects.hash(1, Long.valueOf(((TLRPC.TL_webAuthorization) tLObject2).hash));
                    }
                    hash = Objects.hash(0, -1);
                }
            }
        }
        return hash;
    }

    @Override // f2.r0
    public final int j(int i9) {
        int i10;
        int i11;
        SessionsActivity sessionsActivity = this.d;
        i10 = sessionsActivity.terminateAllSessionsRow;
        if (i9 == i10) {
            return 0;
        }
        if (i9 == sessionsActivity.A || i9 == sessionsActivity.K || i9 == sessionsActivity.E || i9 == sessionsActivity.N || i9 == sessionsActivity.Q || i9 == sessionsActivity.L) {
            return 1;
        }
        if (i9 == sessionsActivity.x || i9 == sessionsActivity.F || i9 == sessionsActivity.B || i9 == sessionsActivity.P) {
            return 2;
        }
        if (i9 == sessionsActivity.y) {
            return 4;
        }
        if (i9 >= sessionsActivity.G && i9 < sessionsActivity.H) {
            return 4;
        }
        if (i9 >= sessionsActivity.I && i9 < sessionsActivity.J) {
            return 4;
        }
        if (i9 >= sessionsActivity.C && i9 < sessionsActivity.D) {
            return 4;
        }
        if (i9 == sessionsActivity.M) {
            return 5;
        }
        i11 = sessionsActivity.ttlRow;
        return i9 == i11 ? 6 : 0;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        int i10;
        int i11 = q1Var.f;
        if (i11 == 0) {
            org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) q1Var.a;
            i10 = this.d.terminateAllSessionsRow;
            if (i9 != i10) {
                if (i9 == this.d.M) {
                    int i12 = org.telegram.ui.ActionBar.f6.q6;
                    p8Var.e(i12, i12);
                    p8Var.setTag(Integer.valueOf(i12));
                    p8Var.m(R.drawable.msg_qrcode, LocaleController.getString(R.string.AuthAnotherClient), !this.d.e.isEmpty());
                    return;
                }
                return;
            }
            int i13 = org.telegram.ui.ActionBar.f6.p7;
            p8Var.e(i13, i13);
            p8Var.setTag(Integer.valueOf(i13));
            if (this.d.w == 0) {
                p8Var.m(R.drawable.msg_block2, LocaleController.getString(R.string.TerminateAllSessions), false);
                return;
            } else {
                p8Var.m(R.drawable.msg_block2, LocaleController.getString(R.string.TerminateAllWebSessions), false);
                return;
            }
        }
        if (i11 == 1) {
            org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) q1Var.a;
            b9Var.setFixedSize(0);
            SessionsActivity sessionsActivity = this.d;
            if (i9 == sessionsActivity.A) {
                if (sessionsActivity.w == 0) {
                    b9Var.setText(LocaleController.getString(R.string.ClearOtherSessionsHelp));
                    return;
                } else {
                    b9Var.setText(LocaleController.getString(R.string.ClearOtherWebSessionsHelp));
                    return;
                }
            }
            if (i9 == sessionsActivity.K) {
                if (sessionsActivity.w != 0) {
                    b9Var.setText(LocaleController.getString(R.string.TerminateWebSessionInfo));
                    return;
                } else if (sessionsActivity.e.isEmpty()) {
                    b9Var.setText("");
                    return;
                } else {
                    b9Var.setText(LocaleController.getString(R.string.SessionsListInfo));
                    return;
                }
            }
            if (i9 == sessionsActivity.E) {
                b9Var.setText(LocaleController.getString(R.string.LoginAttemptsInfo));
                return;
            } else {
                if (i9 == sessionsActivity.N || i9 == sessionsActivity.Q || i9 == sessionsActivity.L) {
                    b9Var.setText("");
                    b9Var.setFixedSize(12);
                    return;
                }
                return;
            }
        }
        if (i11 == 2) {
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) q1Var.a;
            SessionsActivity sessionsActivity2 = this.d;
            if (i9 == sessionsActivity2.x) {
                m4Var.setText(LocaleController.getString(R.string.CurrentSession));
                return;
            }
            if (i9 == sessionsActivity2.F) {
                if (sessionsActivity2.w == 0) {
                    m4Var.setText(LocaleController.getString(R.string.OtherSessions));
                    return;
                } else {
                    m4Var.setText(LocaleController.getString(R.string.OtherWebSessions));
                    return;
                }
            }
            if (i9 == sessionsActivity2.B) {
                m4Var.setText(LocaleController.getString(R.string.LoginAttempts));
                return;
            } else {
                if (i9 == sessionsActivity2.P) {
                    m4Var.setText(LocaleController.getString(R.string.TerminateOldSessionHeader));
                    return;
                }
                return;
            }
        }
        if (i11 != 5) {
            if (i11 == 6) {
                org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) q1Var.a;
                int i14 = this.d.v;
                baVar.c(LocaleController.getString(R.string.IfInactiveFor), (i14 <= 30 || i14 > 183) ? i14 == 365 ? LocaleController.formatPluralString("Years", i14 / 365, new Object[0]) : LocaleController.formatPluralString("Weeks", i14 / 7, new Object[0]) : LocaleController.formatPluralString("Months", i14 / 30, new Object[0]), true, false);
                return;
            }
            org.telegram.ui.Cells.t6 t6Var = (org.telegram.ui.Cells.t6) q1Var.a;
            SessionsActivity sessionsActivity3 = this.d;
            if (i9 == sessionsActivity3.y) {
                TLRPC.TL_authorization tL_authorization = sessionsActivity3.n;
                if (tL_authorization != null) {
                    t6Var.c(tL_authorization, (sessionsActivity3.e.isEmpty() && this.d.f.isEmpty() && this.d.M == -1) ? false : true);
                    return;
                }
                t6Var.w = sessionsActivity3.d;
                t6Var.s = true;
                Drawable mutate = ApplicationLoader.applicationContext.getDrawable(AndroidUtilities.isTablet() ? R.drawable.device_tablet_android : R.drawable.device_phone_android).mutate();
                mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.J7, false), PorterDuff.Mode.SRC_IN));
                org.telegram.ui.Components.fq fqVar = new org.telegram.ui.Components.fq(org.telegram.ui.ActionBar.f6.K(AndroidUtilities.dp(42.0f), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.R7, false)), mutate);
                org.telegram.ui.Components.o9 o9Var = t6Var.f;
                if (o9Var != null) {
                    o9Var.setImageDrawable(fqVar);
                } else {
                    t6Var.h.setImageDrawable(fqVar);
                }
                t6Var.invalidate();
                return;
            }
            int i15 = sessionsActivity3.G;
            if (i9 >= i15 && i9 < sessionsActivity3.H) {
                t6Var.c((TLObject) sessionsActivity3.e.get(i9 - i15), i9 != this.d.H - 1);
                return;
            }
            int i16 = sessionsActivity3.I;
            if (i9 < i16 || i9 >= sessionsActivity3.J) {
                int i17 = sessionsActivity3.C;
                if (i9 < i17 || i9 >= sessionsActivity3.D) {
                    return;
                }
                t6Var.c((TLObject) sessionsActivity3.f.get(i9 - i17), i9 != this.d.D - 1);
                return;
            }
            int i18 = i9 - i16;
            ArrayList arrayList = sessionsActivity3.h;
            if (arrayList == null || i18 < 0 || i18 >= arrayList.size()) {
                return;
            }
            TL_account.TL_connectedBot tL_connectedBot = (TL_account.TL_connectedBot) this.d.h.get(i18);
            SessionsActivity sessionsActivity4 = this.d;
            if (i9 != sessionsActivity4.J - 1 && i9 != sessionsActivity4.H - 1) {
                r1 = true;
            }
            t6Var.c(tL_connectedBot, r1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x022b  */
    @Override // f2.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        FrameLayout frameLayout;
        int i10;
        Context context = this.c;
        if (i9 == 0) {
            frameLayout = new org.telegram.ui.Cells.p8(context);
        } else if (i9 == 1) {
            frameLayout = new org.telegram.ui.Cells.b9(context);
        } else if (i9 != 2) {
            SessionsActivity sessionsActivity = this.d;
            if (i9 == 5) {
                frameLayout = new l71(sessionsActivity, context);
            } else if (i9 != 6) {
                int i11 = sessionsActivity.w;
                org.telegram.ui.Cells.t6 t6Var = new org.telegram.ui.Cells.t6(context);
                t6Var.v = new org.telegram.ui.Components.y5(t6Var);
                t6Var.y = UserConfig.selectedAccount;
                LinearLayout linearLayout = new LinearLayout(context);
                t6Var.x = linearLayout;
                linearLayout.setOrientation(0);
                linearLayout.setWeightSum(1.0f);
                t6Var.a = i11;
                int i12 = 21;
                if (i11 == 1) {
                    boolean z10 = LocaleController.isRTL;
                    t6Var.addView(linearLayout, g7.e6.d(-1, 30.0f, (z10 ? 5 : 3) | 48, z10 ? 15 : 49, 11.0f, z10 ? 49 : 15, 0.0f));
                    org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
                    t6Var.n = z8Var;
                    z8Var.u(AndroidUtilities.dp(10.0f));
                    org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
                    t6Var.h = o9Var;
                    o9Var.setRoundRadius(AndroidUtilities.dp(10.0f));
                    boolean z11 = LocaleController.isRTL;
                    t6Var.addView(o9Var, g7.e6.d(20, 20.0f, (z11 ? 5 : 3) | 48, z11 ? 0 : 21, 13.0f, z11 ? 21 : 0, 0.0f));
                } else {
                    org.telegram.ui.Components.o9 o9Var2 = new org.telegram.ui.Components.o9(context);
                    t6Var.f = o9Var2;
                    o9Var2.setRoundRadius(AndroidUtilities.dp(10.0f));
                    boolean z12 = LocaleController.isRTL;
                    t6Var.addView(o9Var2, g7.e6.d(42, 42.0f, (z12 ? 5 : 3) | 48, z12 ? 0 : 16, 9.0f, z12 ? 16 : 0, 0.0f));
                    t6Var.n = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
                    org.telegram.ui.Components.o9 o9Var3 = new org.telegram.ui.Components.o9(context);
                    t6Var.h = o9Var3;
                    o9Var3.setRoundRadius(AndroidUtilities.dp(10.0f));
                    boolean z13 = LocaleController.isRTL;
                    t6Var.addView(o9Var3, g7.e6.d(42, 42.0f, (z13 ? 5 : 3) | 48, z13 ? 0 : 16, 9.0f, z13 ? 16 : 0, 0.0f));
                    boolean z14 = LocaleController.isRTL;
                    t6Var.addView(linearLayout, g7.e6.d(-1, 30.0f, (z14 ? 5 : 3) | 48, z14 ? 15 : 72, 6.333f, z14 ? 72 : 15, 0.0f));
                }
                TextView textView = new TextView(context);
                t6Var.b = textView;
                int i13 = org.telegram.ui.ActionBar.f6.G6;
                textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i13, false));
                textView.setTextSize(1, i11 == 0 ? 15.0f : 16.0f);
                textView.setLines(1);
                textView.setTypeface(AndroidUtilities.bold());
                textView.setMaxLines(1);
                textView.setSingleLine(true);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
                TextView textView2 = new TextView(context);
                t6Var.c = textView2;
                textView2.setTextSize(1, i11 == 0 ? 12.0f : 13.0f);
                textView2.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
                if (LocaleController.isRTL) {
                    linearLayout.addView(textView2, g7.e6.t(-2, -1, 51, 0, 2, 0, 0));
                    linearLayout.addView(textView, g7.e6.p(0, -1, 1.0f, 53, 10, 0, 0, 0));
                } else {
                    linearLayout.addView(textView, g7.e6.p(0, -1, 1.0f, 51, 0, 0, 10, 0));
                    linearLayout.addView(textView2, g7.e6.t(-2, -1, 53, 0, 2, 0, 0));
                }
                if (!LocaleController.isRTL) {
                    i12 = i11 == 0 ? 72 : 21;
                } else if (i11 == 0) {
                    i10 = 72;
                    TextView textView3 = new TextView(context);
                    t6Var.d = textView3;
                    textView3.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i13, false));
                    textView3.setTextSize(1, i11 != 0 ? 13.0f : 14.0f);
                    textView3.setLines(1);
                    textView3.setMaxLines(1);
                    textView3.setSingleLine(true);
                    textView3.setEllipsize(truncateAt);
                    textView3.setGravity((!LocaleController.isRTL ? 5 : 3) | 48);
                    float f10 = i12;
                    float f11 = i10;
                    t6Var.addView(textView3, g7.e6.d(-1, -2.0f, (!LocaleController.isRTL ? 5 : 3) | 48, f10, i11 != 0 ? 28.0f : 36.0f, f11, 0.0f));
                    TextView textView4 = new TextView(context);
                    t6Var.e = textView4;
                    textView4.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.A6, false));
                    textView4.setTextSize(1, i11 != 0 ? 14.0f : 13.0f);
                    textView4.setLines(1);
                    textView4.setMaxLines(1);
                    textView4.setSingleLine(true);
                    textView4.setEllipsize(truncateAt);
                    textView4.setGravity((!LocaleController.isRTL ? 5 : 3) | 48);
                    t6Var.addView(textView4, g7.e6.d(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, f10, i11 != 0 ? 46.0f : 59.0f, f11, 0.0f));
                    frameLayout = t6Var;
                }
                i10 = 21;
                TextView textView32 = new TextView(context);
                t6Var.d = textView32;
                textView32.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i13, false));
                textView32.setTextSize(1, i11 != 0 ? 13.0f : 14.0f);
                textView32.setLines(1);
                textView32.setMaxLines(1);
                textView32.setSingleLine(true);
                textView32.setEllipsize(truncateAt);
                textView32.setGravity((!LocaleController.isRTL ? 5 : 3) | 48);
                float f102 = i12;
                float f112 = i10;
                t6Var.addView(textView32, g7.e6.d(-1, -2.0f, (!LocaleController.isRTL ? 5 : 3) | 48, f102, i11 != 0 ? 28.0f : 36.0f, f112, 0.0f));
                TextView textView42 = new TextView(context);
                t6Var.e = textView42;
                textView42.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.A6, false));
                textView42.setTextSize(1, i11 != 0 ? 14.0f : 13.0f);
                textView42.setLines(1);
                textView42.setMaxLines(1);
                textView42.setSingleLine(true);
                textView42.setEllipsize(truncateAt);
                textView42.setGravity((!LocaleController.isRTL ? 5 : 3) | 48);
                t6Var.addView(textView42, g7.e6.d(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, f102, i11 != 0 ? 46.0f : 59.0f, f112, 0.0f));
                frameLayout = t6Var;
            } else {
                frameLayout = new org.telegram.ui.Cells.ba(context);
            }
        } else {
            frameLayout = new org.telegram.ui.Cells.m4(context);
        }
        return new org.telegram.ui.Components.ik0(frameLayout);
    }
}
