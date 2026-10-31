package org.telegram.ui;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class p41 extends org.telegram.ui.Components.sk0 {
    public final Context c;
    public final /* synthetic */ SessionsActivity d;

    public p41(SessionsActivity sessionsActivity, Context context) {
        this.d = sessionsActivity;
        this.c = context;
        C(true);
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        int i10;
        int i11;
        int b10 = c1Var.b();
        SessionsActivity sessionsActivity = this.d;
        i10 = sessionsActivity.terminateAllSessionsRow;
        if (b10 == i10) {
            return true;
        }
        if (b10 >= sessionsActivity.J && b10 < sessionsActivity.K) {
            return true;
        }
        if (b10 >= sessionsActivity.L && b10 < sessionsActivity.M) {
            return true;
        }
        if ((b10 >= sessionsActivity.F && b10 < sessionsActivity.G) || b10 == sessionsActivity.y) {
            return true;
        }
        i11 = sessionsActivity.ttlRow;
        return b10 == i11;
    }

    @Override // s4.g0
    public final int b() {
        return this.d.R;
    }

    @Override // s4.g0
    public final long c(int i10) {
        int i11;
        int i12;
        int hash;
        SessionsActivity sessionsActivity = this.d;
        i11 = sessionsActivity.terminateAllSessionsRow;
        if (i10 == i11) {
            hash = Objects.hash(0, 0);
        } else if (i10 == sessionsActivity.D) {
            hash = Objects.hash(0, 1);
        } else if (i10 == sessionsActivity.N) {
            hash = Objects.hash(0, 2);
        } else if (i10 == sessionsActivity.H) {
            hash = Objects.hash(0, 3);
        } else if (i10 == sessionsActivity.Q) {
            hash = Objects.hash(0, 4);
        } else if (i10 == sessionsActivity.T) {
            hash = Objects.hash(0, 5);
        } else if (i10 == sessionsActivity.O) {
            hash = Objects.hash(0, 6);
        } else if (i10 == sessionsActivity.x) {
            hash = Objects.hash(0, 7);
        } else if (i10 == sessionsActivity.I) {
            hash = Objects.hash(0, 8);
        } else if (i10 == sessionsActivity.E) {
            hash = Objects.hash(0, 9);
        } else if (i10 == sessionsActivity.S) {
            hash = Objects.hash(0, 10);
        } else if (i10 == sessionsActivity.y) {
            hash = Objects.hash(0, 11);
        } else {
            int i13 = sessionsActivity.J;
            if (i10 < i13 || i10 >= sessionsActivity.K) {
                int i14 = sessionsActivity.L;
                if (i10 < i14 || i10 >= sessionsActivity.M) {
                    int i15 = sessionsActivity.F;
                    if (i10 >= i15 && i10 < sessionsActivity.G) {
                        TLObject tLObject = (TLObject) sessionsActivity.e.get(i10 - i15);
                        if (tLObject instanceof TLRPC.TL_authorization) {
                            hash = Objects.hash(2, Long.valueOf(((TLRPC.TL_authorization) tLObject).hash));
                        } else {
                            if (tLObject instanceof TLRPC.TL_webAuthorization) {
                                hash = Objects.hash(2, Long.valueOf(((TLRPC.TL_webAuthorization) tLObject).hash));
                            }
                            hash = Objects.hash(0, -1);
                        }
                    } else if (i10 == sessionsActivity.P) {
                        hash = Objects.hash(0, 12);
                    } else {
                        i12 = sessionsActivity.ttlRow;
                        if (i10 == i12) {
                            hash = Objects.hash(0, 13);
                        }
                        hash = Objects.hash(0, -1);
                    }
                } else {
                    hash = Objects.hash(3, Long.valueOf(((TL_account.TL_connectedBot) sessionsActivity.f.get(i10 - i14)).bot_id));
                }
            } else {
                TLObject tLObject2 = (TLObject) sessionsActivity.d.get(i10 - i13);
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

    @Override // s4.g0
    public final int d(int i10) {
        int i11;
        int i12;
        SessionsActivity sessionsActivity = this.d;
        i11 = sessionsActivity.terminateAllSessionsRow;
        if (i10 == i11) {
            return 0;
        }
        if (i10 == sessionsActivity.D || i10 == sessionsActivity.N || i10 == sessionsActivity.H || i10 == sessionsActivity.Q || i10 == sessionsActivity.T || i10 == sessionsActivity.O) {
            return 1;
        }
        if (i10 == sessionsActivity.x || i10 == sessionsActivity.I || i10 == sessionsActivity.E || i10 == sessionsActivity.S) {
            return 2;
        }
        if (i10 == sessionsActivity.y) {
            return 4;
        }
        if (i10 >= sessionsActivity.J && i10 < sessionsActivity.K) {
            return 4;
        }
        if (i10 >= sessionsActivity.L && i10 < sessionsActivity.M) {
            return 4;
        }
        if (i10 >= sessionsActivity.F && i10 < sessionsActivity.G) {
            return 4;
        }
        if (i10 == sessionsActivity.P) {
            return 5;
        }
        i12 = sessionsActivity.ttlRow;
        return i10 == i12 ? 6 : 0;
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        int i11;
        int i12 = c1Var.f;
        if (i12 == 0) {
            org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) c1Var.a;
            i11 = this.d.terminateAllSessionsRow;
            if (i10 != i11) {
                if (i10 == this.d.P) {
                    int i13 = org.telegram.ui.ActionBar.t6.q6;
                    p8Var.g(i13, i13);
                    p8Var.setTag(Integer.valueOf(i13));
                    p8Var.o(R.drawable.msg_qrcode, org.telegram.messenger.cd.L0(2131753894, null), !this.d.d.isEmpty());
                    return;
                }
                return;
            }
            int i14 = org.telegram.ui.ActionBar.t6.p7;
            p8Var.g(i14, i14);
            p8Var.setTag(Integer.valueOf(i14));
            if (this.d.w == 0) {
                p8Var.o(R.drawable.msg_block2, org.telegram.messenger.cd.L0(2131744233, null), false);
                return;
            } else {
                p8Var.o(R.drawable.msg_block2, org.telegram.messenger.cd.L0(2131744232, null), false);
                return;
            }
        }
        if (i12 == 1) {
            org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) c1Var.a;
            b9Var.setFixedSize(0);
            SessionsActivity sessionsActivity = this.d;
            if (i10 == sessionsActivity.D) {
                if (sessionsActivity.w == 0) {
                    b9Var.setText(org.telegram.messenger.cd.L0(2131752074, null));
                    return;
                } else {
                    b9Var.setText(org.telegram.messenger.cd.L0(2131752073, null));
                    return;
                }
            }
            if (i10 == sessionsActivity.N) {
                if (sessionsActivity.w != 0) {
                    b9Var.setText(org.telegram.messenger.cd.L0(2131744228, null));
                    return;
                } else if (sessionsActivity.d.isEmpty()) {
                    b9Var.setText("");
                    return;
                } else {
                    b9Var.setText(org.telegram.messenger.cd.L0(2131745571, null));
                    return;
                }
            }
            if (i10 == sessionsActivity.H) {
                b9Var.setText(org.telegram.messenger.cd.L0(2131748749, null));
                return;
            } else {
                if (i10 == sessionsActivity.Q || i10 == sessionsActivity.T || i10 == sessionsActivity.O) {
                    b9Var.setText("");
                    b9Var.setFixedSize(12);
                    return;
                }
                return;
            }
        }
        if (i12 == 2) {
            org.telegram.ui.Cells.p4 p4Var = (org.telegram.ui.Cells.p4) c1Var.a;
            SessionsActivity sessionsActivity2 = this.d;
            if (i10 == sessionsActivity2.x) {
                p4Var.setText(org.telegram.messenger.cd.L0(2131751694, null));
                return;
            }
            if (i10 == sessionsActivity2.I) {
                if (sessionsActivity2.w == 0) {
                    p4Var.setText(org.telegram.messenger.cd.L0(2131747782, null));
                    return;
                } else {
                    p4Var.setText(org.telegram.messenger.cd.L0(2131747779, null));
                    return;
                }
            }
            if (i10 == sessionsActivity2.E) {
                p4Var.setText(org.telegram.messenger.cd.L0(2131748750, null));
                return;
            } else {
                if (i10 == sessionsActivity2.S) {
                    p4Var.setText(org.telegram.messenger.cd.L0(2131744231, null));
                    return;
                }
                return;
            }
        }
        if (i12 != 5) {
            if (i12 == 6) {
                org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) c1Var.a;
                int i15 = this.d.s;
                x9Var.c(org.telegram.messenger.cd.L0(2131749281, null), (i15 <= 30 || i15 > 183) ? i15 == 365 ? org.telegram.messenger.cd.G(i15 / 365, "Years", new Object[0]) : org.telegram.messenger.cd.G(i15 / 7, "Weeks", new Object[0]) : org.telegram.messenger.cd.G(i15 / 30, "Months", new Object[0]), true, false);
                return;
            }
            org.telegram.ui.Cells.w6 w6Var = (org.telegram.ui.Cells.w6) c1Var.a;
            SessionsActivity sessionsActivity3 = this.d;
            if (i10 != sessionsActivity3.y) {
                int i16 = sessionsActivity3.J;
                if (i10 >= i16 && i10 < sessionsActivity3.K) {
                    w6Var.c((TLObject) sessionsActivity3.d.get(i10 - i16), i10 != this.d.K - 1);
                    return;
                }
                int i17 = sessionsActivity3.L;
                if (i10 < i17 || i10 >= sessionsActivity3.M) {
                    int i18 = sessionsActivity3.F;
                    if (i10 < i18 || i10 >= sessionsActivity3.G) {
                        return;
                    }
                    w6Var.c((TLObject) sessionsActivity3.e.get(i10 - i18), i10 != this.d.G - 1);
                    return;
                }
                int i19 = i10 - i17;
                ArrayList arrayList = sessionsActivity3.f;
                if (arrayList == null || i19 < 0 || i19 >= arrayList.size()) {
                    return;
                }
                TL_account.TL_connectedBot tL_connectedBot = (TL_account.TL_connectedBot) this.d.f.get(i19);
                SessionsActivity sessionsActivity4 = this.d;
                if (i10 != sessionsActivity4.M - 1 && i10 != sessionsActivity4.K - 1) {
                    r1 = true;
                }
                w6Var.c(tL_connectedBot, r1);
                return;
            }
            TLRPC.TL_authorization tL_authorization = sessionsActivity3.h;
            if (tL_authorization == null) {
                tL_authorization = new TLRPC.TL_authorization();
                tL_authorization.flags = 1;
                tL_authorization.current = true;
                tL_authorization.platform = "Android";
                tL_authorization.device_model = Build.MANUFACTURER + " " + Build.MODEL;
                StringBuilder sb2 = new StringBuilder("SDK ");
                sb2.append(Build.VERSION.SDK_INT);
                tL_authorization.system_version = sb2.toString();
                tL_authorization.app_name = "Telegram Android";
                tL_authorization.app_version = "";
                try {
                    PackageInfo packageInfo = org.telegram.messenger.w0.b.getPackageManager().getPackageInfo(org.telegram.messenger.w0.b.getPackageName(), 0);
                    tL_authorization.app_version = packageInfo.versionName + " (" + packageInfo.versionCode + ")";
                    boolean z10 = org.telegram.messenger.v2.a;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(tL_authorization.app_version);
                    sb3.append(" beta");
                    tL_authorization.app_version = sb3.toString();
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
                tL_authorization.country = "";
                tL_authorization.region = "";
                tL_authorization.ip = "";
            }
            w6Var.c(tL_authorization, (this.d.d.isEmpty() && this.d.e.isEmpty() && this.d.P == -1) ? false : true);
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        Context context = this.c;
        if (i10 == 0) {
            frameLayout = new org.telegram.ui.Cells.p8(context);
        } else if (i10 == 1) {
            frameLayout = new org.telegram.ui.Cells.b9(context);
        } else if (i10 != 2) {
            SessionsActivity sessionsActivity = this.d;
            if (i10 == 5) {
                frameLayout = new q41(sessionsActivity, context);
            } else if (i10 != 6) {
                int i11 = sessionsActivity.w;
                org.telegram.ui.Cells.w6 w6Var = new org.telegram.ui.Cells.w6(context);
                w6Var.s = new org.telegram.ui.Components.t5(w6Var);
                w6Var.x = org.telegram.messenger.d20.s0;
                LinearLayout linearLayout = new LinearLayout(context);
                w6Var.w = linearLayout;
                linearLayout.setOrientation(0);
                linearLayout.setWeightSum(1.0f);
                w6Var.a = i11;
                int i12 = 21;
                if (i11 == 1) {
                    boolean z10 = org.telegram.messenger.cd.X;
                    w6Var.addView(linearLayout, w7.b6.d(-1, 30.0f, (z10 ? 5 : 3) | 48, z10 ? 15 : 49, 11.0f, z10 ? 49 : 15, 0.0f));
                    org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
                    w6Var.n = r8Var;
                    r8Var.u(org.telegram.messenger.i0.L(10.0f));
                    org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
                    w6Var.h = g9Var;
                    g9Var.setRoundRadius(org.telegram.messenger.i0.L(10.0f));
                    boolean z11 = org.telegram.messenger.cd.X;
                    w6Var.addView(g9Var, w7.b6.d(20, 20.0f, (z11 ? 5 : 3) | 48, z11 ? 0 : 21, 13.0f, z11 ? 21 : 0, 0.0f));
                } else {
                    org.telegram.ui.Components.g9 g9Var2 = new org.telegram.ui.Components.g9(context);
                    w6Var.f = g9Var2;
                    g9Var2.setRoundRadius(org.telegram.messenger.i0.L(10.0f));
                    boolean z12 = org.telegram.messenger.cd.X;
                    w6Var.addView(g9Var2, w7.b6.d(42, 42.0f, (z12 ? 5 : 3) | 48, z12 ? 0 : 16, 9.0f, z12 ? 16 : 0, 0.0f));
                    w6Var.n = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
                    org.telegram.ui.Components.g9 g9Var3 = new org.telegram.ui.Components.g9(context);
                    w6Var.h = g9Var3;
                    g9Var3.setRoundRadius(org.telegram.messenger.i0.L(10.0f));
                    boolean z13 = org.telegram.messenger.cd.X;
                    w6Var.addView(g9Var3, w7.b6.d(42, 42.0f, (z13 ? 5 : 3) | 48, z13 ? 0 : 16, 9.0f, z13 ? 16 : 0, 0.0f));
                    boolean z14 = org.telegram.messenger.cd.X;
                    w6Var.addView(linearLayout, w7.b6.d(-1, 30.0f, (z14 ? 5 : 3) | 48, z14 ? 15 : 72, 6.333f, z14 ? 72 : 15, 0.0f));
                }
                TextView textView = new TextView(context);
                w6Var.b = textView;
                int i13 = org.telegram.ui.ActionBar.t6.G6;
                org.telegram.ui.ActionBar.a7.V(textView, i13, null);
                textView.setTextSize(1, i11 == 0 ? 15.0f : 16.0f);
                textView.setLines(1);
                textView.setTypeface(org.telegram.messenger.i0.o());
                textView.setMaxLines(1);
                textView.setSingleLine(true);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                textView.setGravity((org.telegram.messenger.cd.X ? 5 : 3) | 48);
                TextView textView2 = new TextView(context);
                w6Var.c = textView2;
                textView2.setTextSize(1, i11 == 0 ? 12.0f : 13.0f);
                textView2.setGravity((org.telegram.messenger.cd.X ? 3 : 5) | 48);
                if (org.telegram.messenger.cd.X) {
                    linearLayout.addView(textView2, w7.b6.t(-2, -1, 51, 0, 2, 0, 0));
                    linearLayout.addView(textView, w7.b6.q(0, -1, 1.0f, 53, 10, 0, 0, 0));
                } else {
                    linearLayout.addView(textView, w7.b6.q(0, -1, 1.0f, 51, 0, 0, 10, 0));
                    linearLayout.addView(textView2, w7.b6.t(-2, -1, 53, 0, 2, 0, 0));
                }
                if (!org.telegram.messenger.cd.X) {
                    i12 = i11 != 0 ? 21 : 72;
                    r8 = 21;
                } else if (i11 != 0) {
                    r8 = 21;
                }
                TextView textView3 = new TextView(context);
                w6Var.d = textView3;
                org.telegram.ui.ActionBar.a7.V(textView3, i13, null);
                org.telegram.messenger.z20.o(textView3, 1, i11 == 0 ? 13.0f : 14.0f, 1, 1);
                textView3.setSingleLine(true);
                textView3.setEllipsize(truncateAt);
                textView3.setGravity((org.telegram.messenger.cd.X ? 5 : 3) | 48);
                float f7 = i12;
                float f10 = r8;
                w6Var.addView(textView3, w7.b6.d(-1, -2.0f, (org.telegram.messenger.cd.X ? 5 : 3) | 48, f7, i11 == 0 ? 28.0f : 36.0f, f10, 0.0f));
                TextView textView4 = new TextView(context);
                w6Var.e = textView4;
                org.telegram.ui.ActionBar.a7.V(textView4, org.telegram.ui.ActionBar.t6.A6, null);
                org.telegram.messenger.z20.o(textView4, 1, i11 != 0 ? 14.0f : 13.0f, 1, 1);
                textView4.setSingleLine(true);
                textView4.setEllipsize(truncateAt);
                textView4.setGravity((org.telegram.messenger.cd.X ? 5 : 3) | 48);
                w6Var.addView(textView4, w7.b6.d(-1, -2.0f, (org.telegram.messenger.cd.X ? 5 : 3) | 48, f7, i11 == 0 ? 46.0f : 59.0f, f10, 0.0f));
                frameLayout = w6Var;
            } else {
                frameLayout = new org.telegram.ui.Cells.x9(context);
            }
        } else {
            frameLayout = new org.telegram.ui.Cells.p4(context);
        }
        return new org.telegram.ui.Components.ck0(frameLayout);
    }
}
