package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public class i9 extends Drawable {
    public static final int[][] C = {new int[]{-636796, -1090751, -612560, -35006}, new int[]{-693938, -690388, -11246, -22717}, new int[]{-8160001, -5217281, -36183, -1938945}, new int[]{-16133536, -10560448, -4070106, -8331477}, new int[]{-10569989, -14692629, -12191817, -14683687}, new int[]{-11694593, -13910017, -14622003, -15801871}, new int[]{-439392, -304000, -19910, -98718}};
    public boolean A;
    public Drawable B;
    public final TextPaint a;
    public boolean b;
    public boolean c;
    public int d;
    public int e;
    public o20 f;
    public boolean g;
    public StaticLayout h;
    public float i;
    public float j;
    public float k;
    public boolean l;
    public boolean m;
    public int n;
    public float o;
    public float p;
    public final StringBuilder q;
    public int r;
    public int s;
    public int t;
    public int u;
    public LinearGradient v;
    public boolean w;
    public boolean x;
    public int y;
    public final org.telegram.ui.ActionBar.f6 z;

    public i9() {
        this((org.telegram.ui.ActionBar.f6) null);
    }

    public static void a(String str, String str2, String str3, StringBuilder sb2) {
        sb2.setLength(0);
        if (str3 != null) {
            sb2.append(str3);
            return;
        }
        if (str != null && str.length() > 0) {
            sb2.append(v(str));
        }
        if (str2 != null && str2.length() > 0) {
            int lastIndexOf = str2.lastIndexOf(32);
            if (lastIndexOf >= 0) {
                str2 = str2.substring(lastIndexOf + 1);
            }
            sb2.append("\u200c");
            sb2.append(v(str2));
            return;
        }
        if (str == null || str.length() <= 0) {
            return;
        }
        for (int length = str.length() - 1; length >= 0; length--) {
            if (str.charAt(length) == ' ' && length != str.length() - 1 && str.charAt(length + 1) != ' ') {
                int length2 = sb2.length();
                sb2.append("\u200c");
                sb2.append(v(str.substring(length2)));
                return;
            }
        }
    }

    public static int d(long j3) {
        return org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.p8[e(j3)], false);
    }

    public static int e(long j3) {
        return (int) Math.abs(j3 % org.telegram.ui.ActionBar.j6.p8.length);
    }

    public static int f(int i10) {
        float[] M0 = org.telegram.ui.ActionBar.j6.M0(5);
        Color.colorToHSV(i10, M0);
        int i11 = (int) M0[0];
        if (i11 >= 345 || i11 < 29) {
            return 0;
        }
        if (i11 < 67) {
            return 1;
        }
        if (i11 < 140) {
            return 3;
        }
        if (i11 < 199) {
            return 4;
        }
        if (i11 < 234) {
            return 5;
        }
        return i11 < 301 ? 2 : 6;
    }

    public static String v(String str) {
        ArrayList<Emoji.EmojiSpanRange> parseEmojis = Emoji.parseEmojis(str);
        return (parseEmojis == null || parseEmojis.isEmpty() || parseEmojis.get(0).start != 0) ? str.substring(0, str.offsetByCodePoints(0, Math.min(str.codePointCount(0, str.length()), 1))) : str.substring(0, parseEmojis.get(0).end);
    }

    public final int b() {
        if (!this.g) {
            return this.d;
        }
        int i10 = this.d;
        org.telegram.ui.ActionBar.h6 k10 = org.telegram.ui.ActionBar.j6.I.k(false);
        return org.telegram.ui.ActionBar.j6.B(org.telegram.ui.ActionBar.j6.I, k10 != null ? k10.c : 0, i10);
    }

    public final int c() {
        if (!this.g) {
            return this.e;
        }
        int i10 = this.e;
        org.telegram.ui.ActionBar.h6 k10 = org.telegram.ui.ActionBar.j6.I.k(false);
        return org.telegram.ui.ActionBar.j6.B(org.telegram.ui.ActionBar.j6.I, k10 != null ? k10.c : 0, i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable[] drawableArr;
        Drawable drawable;
        o20 o20Var;
        Rect bounds = getBounds();
        if (bounds == null) {
            return;
        }
        int width = bounds.width();
        int i10 = org.telegram.ui.ActionBar.j6.J7;
        org.telegram.ui.ActionBar.f6 f6Var = this.z;
        int k10 = i0.a.k(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), this.y);
        TextPaint textPaint = this.a;
        textPaint.setColor(k10);
        Paint paint = org.telegram.ui.ActionBar.j6.q0;
        if (this.c && (o20Var = this.f) != null) {
            o20Var.b(bounds.left, bounds.top, r4 + width, r10 + width);
            paint = this.f.c;
        } else if (this.b) {
            int k11 = i0.a.k(b(), this.y);
            int k12 = i0.a.k(c(), this.y);
            if (this.v == null || this.s != bounds.height() || this.t != k11 || this.u != k12) {
                int height = bounds.height();
                this.s = height;
                this.t = k11;
                this.u = k12;
                this.v = new LinearGradient(0.0f, 0.0f, 0.0f, height, k11, k12, Shader.TileMode.CLAMP);
            }
            paint.setShader(this.v);
            paint.setAlpha(this.y);
        } else {
            paint.setShader(null);
            paint.setColor(i0.a.k(b(), this.y));
        }
        canvas.save();
        canvas.translate(bounds.left, bounds.top);
        if (this.w) {
            if (this.x) {
                canvas.save();
                float f7 = width / 2.0f;
                canvas.rotate(-45.0f, f7, f7);
            }
            if (this.r > 0) {
                RectF rectF = AndroidUtilities.rectTmp;
                float f10 = width;
                rectF.set(0.0f, 0.0f, f10, f10);
                float f11 = this.r;
                canvas.drawRoundRect(rectF, f11, f11, paint);
            } else {
                float f12 = width / 2.0f;
                canvas.drawCircle(f12, f12, f12, paint);
            }
            if (this.x) {
                canvas.restore();
            }
        }
        int i11 = this.n;
        if (i11 == 2) {
            if (this.o != 0.0f) {
                int i12 = org.telegram.ui.ActionBar.j6.M7;
                paint.setColor(i0.a.k(org.telegram.ui.ActionBar.j6.v0(i12, f6Var), this.y));
                float f13 = width / 2.0f;
                canvas.drawCircle(f13, f13, this.o * f13, paint);
                if (org.telegram.ui.ActionBar.j6.C1) {
                    xi0 xi0Var = org.telegram.ui.ActionBar.j6.u1;
                    xi0Var.a0 = true;
                    xi0Var.O(org.telegram.ui.ActionBar.j6.w0(null, i12, true), "Arrow1");
                    org.telegram.ui.ActionBar.j6.u1.O(org.telegram.ui.ActionBar.j6.w0(null, i12, true), "Arrow2");
                    org.telegram.ui.ActionBar.j6.u1.m();
                    org.telegram.ui.ActionBar.j6.C1 = false;
                }
            } else if (!org.telegram.ui.ActionBar.j6.C1) {
                xi0 xi0Var2 = org.telegram.ui.ActionBar.j6.u1;
                xi0Var2.a0 = true;
                xi0Var2.O(this.d, "Arrow1");
                org.telegram.ui.ActionBar.j6.u1.O(this.d, "Arrow2");
                org.telegram.ui.ActionBar.j6.u1.m();
                org.telegram.ui.ActionBar.j6.C1 = true;
            }
            xi0 xi0Var3 = org.telegram.ui.ActionBar.j6.u1;
            int i13 = xi0Var3.b;
            int i14 = xi0Var3.c;
            int i15 = (width - i13) / 2;
            int i16 = (width - i14) / 2;
            canvas.save();
            org.telegram.ui.ActionBar.j6.u1.setBounds(i15, i16, i13 + i15, i14 + i16);
            org.telegram.ui.ActionBar.j6.u1.draw(canvas);
            canvas.restore();
        } else if (i11 != 0 || this.B != null) {
            Drawable drawable2 = this.B;
            if (drawable2 == null) {
                drawable2 = i11 == 1 ? org.telegram.ui.ActionBar.j6.r0[0] : i11 == 4 ? org.telegram.ui.ActionBar.j6.r0[2] : i11 == 5 ? org.telegram.ui.ActionBar.j6.r0[3] : i11 == 6 ? org.telegram.ui.ActionBar.j6.r0[4] : i11 == 7 ? org.telegram.ui.ActionBar.j6.r0[5] : i11 == 8 ? org.telegram.ui.ActionBar.j6.r0[6] : i11 == 9 ? org.telegram.ui.ActionBar.j6.r0[7] : i11 == 10 ? org.telegram.ui.ActionBar.j6.r0[8] : i11 == 3 ? org.telegram.ui.ActionBar.j6.r0[10] : i11 == 12 ? org.telegram.ui.ActionBar.j6.r0[11] : i11 == 14 ? org.telegram.ui.ActionBar.j6.r0[12] : i11 == 15 ? org.telegram.ui.ActionBar.j6.r0[13] : i11 == 16 ? org.telegram.ui.ActionBar.j6.r0[14] : i11 == 19 ? org.telegram.ui.ActionBar.j6.r0[15] : i11 == 18 ? org.telegram.ui.ActionBar.j6.r0[16] : i11 == 20 ? org.telegram.ui.ActionBar.j6.r0[17] : i11 == 21 ? org.telegram.ui.ActionBar.j6.r0[18] : i11 == 22 ? org.telegram.ui.ActionBar.j6.r0[19] : i11 == 23 ? org.telegram.ui.ActionBar.j6.r0[21] : i11 == 24 ? org.telegram.ui.ActionBar.j6.r0[20] : i11 == 25 ? org.telegram.ui.ActionBar.j6.r0[22] : i11 == 26 ? org.telegram.ui.ActionBar.j6.r0[23] : i11 == 27 ? org.telegram.ui.ActionBar.j6.r0[24] : org.telegram.ui.ActionBar.j6.r0[9];
            }
            if (drawable2 != null) {
                int intrinsicWidth = (int) (drawable2.getIntrinsicWidth() * this.p);
                int intrinsicHeight = (int) (drawable2.getIntrinsicHeight() * this.p);
                int i17 = (width - intrinsicWidth) / 2;
                int i18 = (width - intrinsicHeight) / 2;
                drawable2.setBounds(i17, i18, intrinsicWidth + i17, intrinsicHeight + i18);
                int i19 = this.y;
                if (i19 != 255) {
                    drawable2.setAlpha(i19);
                    drawable2.draw(canvas);
                    drawable2.setAlpha(255);
                } else {
                    drawable2.draw(canvas);
                }
            }
        } else if (!this.m || (drawable = (drawableArr = org.telegram.ui.ActionBar.j6.r0)[1]) == null) {
            if (this.A) {
                this.A = false;
                StringBuilder sb2 = this.q;
                if (sb2.length() > 0) {
                    CharSequence replaceEmoji = Emoji.replaceEmoji(sb2.toString().toUpperCase(), textPaint.getFontMetricsInt(), true);
                    StaticLayout staticLayout = this.h;
                    if (staticLayout == null || !TextUtils.equals(replaceEmoji, staticLayout.getText())) {
                        try {
                            StaticLayout staticLayout2 = new StaticLayout(replaceEmoji, textPaint, AndroidUtilities.dp(100.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                            this.h = staticLayout2;
                            if (staticLayout2.getLineCount() > 0) {
                                this.k = this.h.getLineLeft(0);
                                this.i = this.h.getLineWidth(0);
                                this.j = this.h.getLineBottom(0);
                            }
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                    }
                } else {
                    this.h = null;
                }
            }
            if (this.h != null) {
                float f14 = width;
                float dp = f14 / AndroidUtilities.dp(50.0f);
                float f15 = f14 / 2.0f;
                canvas.scale(dp, dp, f15, f15);
                canvas.translate(((f14 - this.i) / 2.0f) - this.k, (f14 - this.j) / 2.0f);
                this.h.draw(canvas);
            }
        } else {
            int intrinsicWidth2 = drawable.getIntrinsicWidth();
            int intrinsicHeight2 = drawableArr[1].getIntrinsicHeight();
            if (this.l) {
                float f16 = intrinsicWidth2;
                float f17 = this.p;
                intrinsicHeight2 = (int) (intrinsicHeight2 * f17);
                intrinsicWidth2 = (int) (f16 * f17);
            } else if (intrinsicWidth2 > width - AndroidUtilities.dp(6.0f) || intrinsicHeight2 > width - AndroidUtilities.dp(6.0f)) {
                float dp2 = width / AndroidUtilities.dp(50.0f);
                intrinsicWidth2 = (int) (intrinsicWidth2 * dp2);
                intrinsicHeight2 = (int) (intrinsicHeight2 * dp2);
            }
            int i20 = (width - intrinsicWidth2) / 2;
            int i21 = (width - intrinsicHeight2) / 2;
            drawableArr[1].setBounds(i20, i21, intrinsicWidth2 + i20, intrinsicHeight2 + i21);
            drawableArr[1].draw(canvas);
        }
        canvas.restore();
    }

    public final void g(int i10) {
        this.n = i10;
        boolean z10 = false;
        this.x = false;
        this.c = false;
        this.b = false;
        if (i10 == 13) {
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.P9, false);
            this.e = w02;
            this.d = w02;
        } else {
            org.telegram.ui.ActionBar.f6 f6Var = this.z;
            if (i10 == 2) {
                int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.N7, f6Var);
                this.e = v02;
                this.d = v02;
            } else if (i10 == 27 || i10 == 12 || i10 == 1 || i10 == 14) {
                this.b = true;
                this.d = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.K7, f6Var);
                this.e = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.L7, f6Var);
            } else if (i10 == 20) {
                this.x = true;
                this.b = true;
                this.d = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.hk, f6Var);
                this.e = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.ik, f6Var);
            } else if (i10 == 3) {
                this.b = true;
                this.d = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.p8[e(5L)], f6Var);
                this.e = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.q8[e(5L)], f6Var);
            } else if (i10 == 25) {
                this.b = true;
                this.d = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.p8[e(2L)], f6Var);
                this.e = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.q8[e(2L)], f6Var);
            } else if (i10 == 26) {
                this.b = true;
                this.d = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.p8[e(1L)], f6Var);
                this.e = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.q8[e(1L)], f6Var);
            } else if (i10 == 4) {
                this.b = true;
                this.d = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.p8[e(5L)], f6Var);
                this.e = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.q8[e(5L)], f6Var);
            } else if (i10 == 5) {
                this.b = true;
                this.d = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.p8[e(4L)], f6Var);
                this.e = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.q8[e(4L)], f6Var);
            } else if (i10 == 6 || i10 == 23) {
                this.b = true;
                this.d = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.p8[e(3L)], f6Var);
                this.e = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.q8[e(3L)], f6Var);
            } else if (i10 == 7 || i10 == 24) {
                this.b = true;
                this.d = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.p8[e(1L)], f6Var);
                this.e = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.q8[e(1L)], f6Var);
            } else if (i10 == 8) {
                this.b = true;
                this.d = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.p8[e(0L)], f6Var);
                this.e = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.q8[e(0L)], f6Var);
            } else if (i10 == 9) {
                this.b = true;
                this.d = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.p8[e(6L)], f6Var);
                this.e = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.q8[e(6L)], f6Var);
            } else if (i10 == 10) {
                this.b = true;
                this.d = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.p8[e(5L)], f6Var);
                this.e = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.q8[e(5L)], f6Var);
            } else if (i10 == 17) {
                this.b = true;
                this.d = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.p8[e(5L)], f6Var);
                this.e = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.q8[e(5L)], f6Var);
            } else if (i10 == 21) {
                this.c = true;
                if (this.f == null) {
                    this.f = new o20();
                }
                this.f.d(-8160001, -5217281, -36183, -1938945);
            } else if (i10 == 22) {
                this.c = true;
                if (this.f == null) {
                    this.f = new o20();
                }
                this.f.d(-11694593, -13910017, -14622003, -15801871);
            } else {
                this.b = true;
                this.d = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.p8[e(4L)], f6Var);
                this.e = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.q8[e(4L)], f6Var);
            }
        }
        int i11 = this.n;
        if (i11 != 2 && i11 != 1 && i11 != 20 && i11 != 21 && i11 != 27 && i11 != 12 && i11 != 14) {
            z10 = true;
        }
        this.g = z10;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    public final void h(int i10) {
        this.b = false;
        this.c = false;
        this.e = i10;
        this.d = i10;
        this.g = false;
    }

    public final void i(int i10, int i11) {
        this.b = true;
        this.c = false;
        this.d = i10;
        this.e = i11;
        this.g = false;
    }

    public final void j(int i10, TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            m(i10, (TLRPC.User) tLObject);
        } else if (tLObject instanceof TLRPC.Chat) {
            k(i10, (TLRPC.Chat) tLObject);
        } else if (tLObject instanceof TLRPC.ChatInvite) {
            l(i10, (TLRPC.ChatInvite) tLObject);
        }
    }

    public final void k(int i10, TLRPC.Chat chat) {
        if (chat != null) {
            o(chat.id, chat.title, null, chat.color != null ? Integer.valueOf(ChatObject.getColorId(chat)) : null, ChatObject.getPeerColorForAvatar(i10, chat));
        }
    }

    public final void l(int i10, TLRPC.ChatInvite chatInvite) {
        if (chatInvite != null) {
            String str = chatInvite.title;
            TLRPC.Chat chat = chatInvite.chat;
            o(0L, str, null, (chat == null || chat.color == null) ? null : Integer.valueOf(ChatObject.getColorId(chat)), ChatObject.getPeerColorForAvatar(i10, chatInvite.chat));
        }
    }

    public final void m(int i10, TLRPC.User user) {
        if (user != null) {
            o(user.id, user.first_name, user.last_name, user.color != null ? Integer.valueOf(UserObject.getColorId(user)) : null, UserObject.getPeerColorForAvatar(i10, user));
            this.m = UserObject.isDeleted(user);
        }
    }

    public final void n(long j3, String str, String str2) {
        o(j3, str, str2, null, null);
    }

    public final void o(long j3, String str, String str2, Integer num, MessagesController.PeerColor peerColor) {
        this.A = true;
        this.b = true;
        this.c = false;
        if (peerColor != null) {
            this.d = peerColor.getAvatarColor1();
            this.e = peerColor.getAvatarColor2();
        } else if (num != null) {
            s(num.intValue());
        } else {
            int i10 = org.telegram.ui.ActionBar.j6.p8[e(j3)];
            org.telegram.ui.ActionBar.f6 f6Var = this.z;
            this.d = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
            this.e = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.q8[e(j3)], f6Var);
        }
        this.g = j3 == 5;
        this.n = 0;
        this.m = false;
        if (str == null || str.length() == 0) {
            str = str2;
            str2 = null;
        }
        a(str, str2, null, this.q);
    }

    public final void p(TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            r((TLRPC.User) tLObject);
            return;
        }
        if (tLObject instanceof TLRPC.Chat) {
            q((TLRPC.Chat) tLObject);
        } else if (tLObject instanceof TLRPC.ChatInvite) {
            l(UserConfig.selectedAccount, (TLRPC.ChatInvite) tLObject);
        }
    }

    public final void q(TLRPC.Chat chat) {
        k(UserConfig.selectedAccount, chat);
    }

    public final void r(TLRPC.User user) {
        m(UserConfig.selectedAccount, user);
    }

    public final void s(int i10) {
        MessagesController.PeerColors peerColors;
        o20 o20Var = this.f;
        if (o20Var != null) {
            this.b = false;
            this.c = true;
        } else {
            this.b = true;
            this.c = false;
        }
        int[][] iArr = C;
        org.telegram.ui.ActionBar.f6 f6Var = this.z;
        if (i10 < 14) {
            if (o20Var != null) {
                int[] iArr2 = iArr[e(i10)];
                this.f.d(iArr2[0], iArr2[1], iArr2[2], iArr2[3]);
                return;
            } else {
                long j3 = i10;
                this.d = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.p8[e(j3)], f6Var);
                this.e = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.q8[e(j3)], f6Var);
                return;
            }
        }
        MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
        if (messagesController == null || (peerColors = messagesController.peerColors) == null || peerColors.getColor(i10) == null) {
            if (this.f != null) {
                int[] iArr3 = iArr[e(i10)];
                this.f.d(iArr3[0], iArr3[1], iArr3[2], iArr3[3]);
                return;
            } else {
                long j10 = i10;
                this.d = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.p8[e(j10)], f6Var);
                this.e = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.q8[e(j10)], f6Var);
                return;
            }
        }
        int color1 = messagesController.peerColors.getColor(i10).getColor1();
        if (this.f != null) {
            int[] iArr4 = iArr[f(color1)];
            this.f.d(iArr4[0], iArr4[1], iArr4[2], iArr4[3]);
        } else {
            this.d = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.p8[f(color1)], f6Var);
            this.e = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.q8[f(color1)], f6Var);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.y = i10;
    }

    public final void t() {
        this.l = true;
    }

    public final void u(int i10) {
        this.a.setTextSize(i10);
    }

    public i9(int i10, TLRPC.User user) {
        this((org.telegram.ui.ActionBar.f6) null);
        this.l = false;
        if (user != null) {
            o(user.id, user.first_name, user.last_name, null, null);
            this.m = UserObject.isDeleted(user);
        }
    }

    public i9(TLRPC.Chat chat) {
        this((org.telegram.ui.ActionBar.f6) null);
        this.l = false;
        q(chat);
    }

    public i9(org.telegram.ui.ActionBar.f6 f6Var) {
        this.p = 1.0f;
        this.q = new StringBuilder(5);
        this.r = -1;
        this.w = true;
        this.x = false;
        this.y = 255;
        this.z = f6Var;
        TextPaint textPaint = new TextPaint(1);
        this.a = textPaint;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(18.0f));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
