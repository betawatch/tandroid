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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class z8 extends Drawable {
    public static final int[][] C = {new int[]{-636796, -1090751, -612560, -35006}, new int[]{-693938, -690388, -11246, -22717}, new int[]{-8160001, -5217281, -36183, -1938945}, new int[]{-16133536, -10560448, -4070106, -8331477}, new int[]{-10569989, -14692629, -12191817, -14683687}, new int[]{-11694593, -13910017, -14622003, -15801871}, new int[]{-439392, -304000, -19910, -98718}};
    public boolean A;
    public Drawable B;
    public final TextPaint a;
    public boolean b;
    public boolean c;
    public int d;
    public int e;
    public z10 f;
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
    public final org.telegram.ui.ActionBar.b6 z;

    public z8() {
        this((org.telegram.ui.ActionBar.b6) null);
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

    public static int d(long j10) {
        return org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.p8[e(j10)], false);
    }

    public static int e(long j10) {
        return (int) Math.abs(j10 % org.telegram.ui.ActionBar.f6.p8.length);
    }

    public static int f(int i9) {
        float[] M0 = org.telegram.ui.ActionBar.f6.M0(5);
        Color.colorToHSV(i9, M0);
        int i10 = (int) M0[0];
        if (i10 >= 345 || i10 < 29) {
            return 0;
        }
        if (i10 < 67) {
            return 1;
        }
        if (i10 < 140) {
            return 3;
        }
        if (i10 < 199) {
            return 4;
        }
        if (i10 < 234) {
            return 5;
        }
        return i10 < 301 ? 2 : 6;
    }

    public static String v(String str) {
        ArrayList<Emoji.EmojiSpanRange> parseEmojis = Emoji.parseEmojis(str);
        return (parseEmojis == null || parseEmojis.isEmpty() || parseEmojis.get(0).start != 0) ? str.substring(0, str.offsetByCodePoints(0, Math.min(str.codePointCount(0, str.length()), 1))) : str.substring(0, parseEmojis.get(0).end);
    }

    public final int b() {
        if (!this.g) {
            return this.d;
        }
        int i9 = this.d;
        org.telegram.ui.ActionBar.d6 k10 = org.telegram.ui.ActionBar.f6.I.k(false);
        return org.telegram.ui.ActionBar.f6.B(org.telegram.ui.ActionBar.f6.I, k10 != null ? k10.c : 0, i9);
    }

    public final int c() {
        if (!this.g) {
            return this.e;
        }
        int i9 = this.e;
        org.telegram.ui.ActionBar.d6 k10 = org.telegram.ui.ActionBar.f6.I.k(false);
        return org.telegram.ui.ActionBar.f6.B(org.telegram.ui.ActionBar.f6.I, k10 != null ? k10.c : 0, i9);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable[] drawableArr;
        Drawable drawable;
        z10 z10Var;
        Rect bounds = getBounds();
        if (bounds == null) {
            return;
        }
        int width = bounds.width();
        int i9 = org.telegram.ui.ActionBar.f6.J7;
        org.telegram.ui.ActionBar.b6 b6Var = this.z;
        int k10 = i0.a.k(org.telegram.ui.ActionBar.f6.v0(i9, b6Var), this.y);
        TextPaint textPaint = this.a;
        textPaint.setColor(k10);
        Paint paint = org.telegram.ui.ActionBar.f6.q0;
        if (this.c && (z10Var = this.f) != null) {
            z10Var.b(bounds.left, bounds.top, r4 + width, r10 + width);
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
                float f10 = width / 2.0f;
                canvas.rotate(-45.0f, f10, f10);
            }
            if (this.r > 0) {
                RectF rectF = AndroidUtilities.rectTmp;
                float f11 = width;
                rectF.set(0.0f, 0.0f, f11, f11);
                float f12 = this.r;
                canvas.drawRoundRect(rectF, f12, f12, paint);
            } else {
                float f13 = width / 2.0f;
                canvas.drawCircle(f13, f13, f13, paint);
            }
            if (this.x) {
                canvas.restore();
            }
        }
        int i10 = this.n;
        if (i10 == 2) {
            if (this.o != 0.0f) {
                int i11 = org.telegram.ui.ActionBar.f6.M7;
                paint.setColor(i0.a.k(org.telegram.ui.ActionBar.f6.v0(i11, b6Var), this.y));
                float f14 = width / 2.0f;
                canvas.drawCircle(f14, f14, this.o * f14, paint);
                if (org.telegram.ui.ActionBar.f6.C1) {
                    mi0 mi0Var = org.telegram.ui.ActionBar.f6.u1;
                    mi0Var.W = true;
                    mi0Var.O(org.telegram.ui.ActionBar.f6.w0(null, i11, true), "Arrow1");
                    org.telegram.ui.ActionBar.f6.u1.O(org.telegram.ui.ActionBar.f6.w0(null, i11, true), "Arrow2");
                    org.telegram.ui.ActionBar.f6.u1.m();
                    org.telegram.ui.ActionBar.f6.C1 = false;
                }
            } else if (!org.telegram.ui.ActionBar.f6.C1) {
                mi0 mi0Var2 = org.telegram.ui.ActionBar.f6.u1;
                mi0Var2.W = true;
                mi0Var2.O(this.d, "Arrow1");
                org.telegram.ui.ActionBar.f6.u1.O(this.d, "Arrow2");
                org.telegram.ui.ActionBar.f6.u1.m();
                org.telegram.ui.ActionBar.f6.C1 = true;
            }
            mi0 mi0Var3 = org.telegram.ui.ActionBar.f6.u1;
            int i12 = mi0Var3.b;
            int i13 = mi0Var3.c;
            int i14 = (width - i12) / 2;
            int i15 = (width - i13) / 2;
            canvas.save();
            org.telegram.ui.ActionBar.f6.u1.setBounds(i14, i15, i12 + i14, i13 + i15);
            org.telegram.ui.ActionBar.f6.u1.draw(canvas);
            canvas.restore();
        } else if (i10 != 0 || this.B != null) {
            Drawable drawable2 = this.B;
            if (drawable2 == null) {
                drawable2 = i10 == 1 ? org.telegram.ui.ActionBar.f6.r0[0] : i10 == 4 ? org.telegram.ui.ActionBar.f6.r0[2] : i10 == 5 ? org.telegram.ui.ActionBar.f6.r0[3] : i10 == 6 ? org.telegram.ui.ActionBar.f6.r0[4] : i10 == 7 ? org.telegram.ui.ActionBar.f6.r0[5] : i10 == 8 ? org.telegram.ui.ActionBar.f6.r0[6] : i10 == 9 ? org.telegram.ui.ActionBar.f6.r0[7] : i10 == 10 ? org.telegram.ui.ActionBar.f6.r0[8] : i10 == 3 ? org.telegram.ui.ActionBar.f6.r0[10] : i10 == 12 ? org.telegram.ui.ActionBar.f6.r0[11] : i10 == 14 ? org.telegram.ui.ActionBar.f6.r0[12] : i10 == 15 ? org.telegram.ui.ActionBar.f6.r0[13] : i10 == 16 ? org.telegram.ui.ActionBar.f6.r0[14] : i10 == 19 ? org.telegram.ui.ActionBar.f6.r0[15] : i10 == 18 ? org.telegram.ui.ActionBar.f6.r0[16] : i10 == 20 ? org.telegram.ui.ActionBar.f6.r0[17] : i10 == 21 ? org.telegram.ui.ActionBar.f6.r0[18] : i10 == 22 ? org.telegram.ui.ActionBar.f6.r0[19] : i10 == 23 ? org.telegram.ui.ActionBar.f6.r0[21] : i10 == 24 ? org.telegram.ui.ActionBar.f6.r0[20] : i10 == 25 ? org.telegram.ui.ActionBar.f6.r0[22] : i10 == 26 ? org.telegram.ui.ActionBar.f6.r0[23] : i10 == 27 ? org.telegram.ui.ActionBar.f6.r0[24] : org.telegram.ui.ActionBar.f6.r0[9];
            }
            if (drawable2 != null) {
                int intrinsicWidth = (int) (drawable2.getIntrinsicWidth() * this.p);
                int intrinsicHeight = (int) (drawable2.getIntrinsicHeight() * this.p);
                int i16 = (width - intrinsicWidth) / 2;
                int i17 = (width - intrinsicHeight) / 2;
                drawable2.setBounds(i16, i17, intrinsicWidth + i16, intrinsicHeight + i17);
                int i18 = this.y;
                if (i18 != 255) {
                    drawable2.setAlpha(i18);
                    drawable2.draw(canvas);
                    drawable2.setAlpha(255);
                } else {
                    drawable2.draw(canvas);
                }
            }
        } else if (!this.m || (drawable = (drawableArr = org.telegram.ui.ActionBar.f6.r0)[1]) == null) {
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
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                    }
                } else {
                    this.h = null;
                }
            }
            if (this.h != null) {
                float f15 = width;
                float dp = f15 / AndroidUtilities.dp(50.0f);
                float f16 = f15 / 2.0f;
                canvas.scale(dp, dp, f16, f16);
                canvas.translate(((f15 - this.i) / 2.0f) - this.k, (f15 - this.j) / 2.0f);
                this.h.draw(canvas);
            }
        } else {
            int intrinsicWidth2 = drawable.getIntrinsicWidth();
            int intrinsicHeight2 = drawableArr[1].getIntrinsicHeight();
            if (this.l) {
                float f17 = intrinsicWidth2;
                float f18 = this.p;
                intrinsicHeight2 = (int) (intrinsicHeight2 * f18);
                intrinsicWidth2 = (int) (f17 * f18);
            } else if (intrinsicWidth2 > width - AndroidUtilities.dp(6.0f) || intrinsicHeight2 > width - AndroidUtilities.dp(6.0f)) {
                float dp2 = width / AndroidUtilities.dp(50.0f);
                intrinsicWidth2 = (int) (intrinsicWidth2 * dp2);
                intrinsicHeight2 = (int) (intrinsicHeight2 * dp2);
            }
            int i19 = (width - intrinsicWidth2) / 2;
            int i20 = (width - intrinsicHeight2) / 2;
            drawableArr[1].setBounds(i19, i20, intrinsicWidth2 + i19, intrinsicHeight2 + i20);
            drawableArr[1].draw(canvas);
        }
        canvas.restore();
    }

    public final void g(int i9) {
        this.n = i9;
        boolean z10 = false;
        this.x = false;
        this.c = false;
        this.b = false;
        if (i9 == 13) {
            int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.P9, false);
            this.e = w02;
            this.d = w02;
        } else {
            org.telegram.ui.ActionBar.b6 b6Var = this.z;
            if (i9 == 2) {
                int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.N7, b6Var);
                this.e = v02;
                this.d = v02;
            } else if (i9 == 27 || i9 == 12 || i9 == 1 || i9 == 14) {
                this.b = true;
                this.d = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.K7, b6Var);
                this.e = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.L7, b6Var);
            } else if (i9 == 20) {
                this.x = true;
                this.b = true;
                this.d = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.hk, b6Var);
                this.e = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.ik, b6Var);
            } else if (i9 == 3) {
                this.b = true;
                this.d = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.p8[e(5L)], b6Var);
                this.e = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.q8[e(5L)], b6Var);
            } else if (i9 == 25) {
                this.b = true;
                this.d = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.p8[e(2L)], b6Var);
                this.e = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.q8[e(2L)], b6Var);
            } else if (i9 == 26) {
                this.b = true;
                this.d = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.p8[e(1L)], b6Var);
                this.e = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.q8[e(1L)], b6Var);
            } else if (i9 == 4) {
                this.b = true;
                this.d = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.p8[e(5L)], b6Var);
                this.e = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.q8[e(5L)], b6Var);
            } else if (i9 == 5) {
                this.b = true;
                this.d = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.p8[e(4L)], b6Var);
                this.e = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.q8[e(4L)], b6Var);
            } else if (i9 == 6 || i9 == 23) {
                this.b = true;
                this.d = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.p8[e(3L)], b6Var);
                this.e = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.q8[e(3L)], b6Var);
            } else if (i9 == 7 || i9 == 24) {
                this.b = true;
                this.d = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.p8[e(1L)], b6Var);
                this.e = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.q8[e(1L)], b6Var);
            } else if (i9 == 8) {
                this.b = true;
                this.d = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.p8[e(0L)], b6Var);
                this.e = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.q8[e(0L)], b6Var);
            } else if (i9 == 9) {
                this.b = true;
                this.d = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.p8[e(6L)], b6Var);
                this.e = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.q8[e(6L)], b6Var);
            } else if (i9 == 10) {
                this.b = true;
                this.d = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.p8[e(5L)], b6Var);
                this.e = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.q8[e(5L)], b6Var);
            } else if (i9 == 17) {
                this.b = true;
                this.d = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.p8[e(5L)], b6Var);
                this.e = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.q8[e(5L)], b6Var);
            } else if (i9 == 21) {
                this.c = true;
                if (this.f == null) {
                    this.f = new z10();
                }
                this.f.d(-8160001, -5217281, -36183, -1938945);
            } else if (i9 == 22) {
                this.c = true;
                if (this.f == null) {
                    this.f = new z10();
                }
                this.f.d(-11694593, -13910017, -14622003, -15801871);
            } else {
                this.b = true;
                this.d = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.p8[e(4L)], b6Var);
                this.e = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.q8[e(4L)], b6Var);
            }
        }
        int i10 = this.n;
        if (i10 != 2 && i10 != 1 && i10 != 20 && i10 != 21 && i10 != 27 && i10 != 12 && i10 != 14) {
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

    public final void h(int i9) {
        this.b = false;
        this.c = false;
        this.e = i9;
        this.d = i9;
        this.g = false;
    }

    public final void i(int i9, int i10) {
        this.b = true;
        this.c = false;
        this.d = i9;
        this.e = i10;
        this.g = false;
    }

    public final void j(int i9, TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            m(i9, (TLRPC.User) tLObject);
        } else if (tLObject instanceof TLRPC.Chat) {
            k(i9, (TLRPC.Chat) tLObject);
        } else if (tLObject instanceof TLRPC.ChatInvite) {
            l(i9, (TLRPC.ChatInvite) tLObject);
        }
    }

    public final void k(int i9, TLRPC.Chat chat) {
        if (chat != null) {
            o(chat.id, chat.title, null, chat.color != null ? Integer.valueOf(ChatObject.getColorId(chat)) : null, ChatObject.getPeerColorForAvatar(i9, chat));
        }
    }

    public final void l(int i9, TLRPC.ChatInvite chatInvite) {
        if (chatInvite != null) {
            String str = chatInvite.title;
            TLRPC.Chat chat = chatInvite.chat;
            o(0L, str, null, (chat == null || chat.color == null) ? null : Integer.valueOf(ChatObject.getColorId(chat)), ChatObject.getPeerColorForAvatar(i9, chatInvite.chat));
        }
    }

    public final void m(int i9, TLRPC.User user) {
        if (user != null) {
            o(user.id, user.first_name, user.last_name, user.color != null ? Integer.valueOf(UserObject.getColorId(user)) : null, UserObject.getPeerColorForAvatar(i9, user));
            this.m = UserObject.isDeleted(user);
        }
    }

    public final void n(long j10, String str, String str2) {
        o(j10, str, str2, null, null);
    }

    public final void o(long j10, String str, String str2, Integer num, MessagesController.PeerColor peerColor) {
        this.A = true;
        this.b = true;
        this.c = false;
        if (peerColor != null) {
            this.d = peerColor.getAvatarColor1();
            this.e = peerColor.getAvatarColor2();
        } else if (num != null) {
            s(num.intValue());
        } else {
            int i9 = org.telegram.ui.ActionBar.f6.p8[e(j10)];
            org.telegram.ui.ActionBar.b6 b6Var = this.z;
            this.d = org.telegram.ui.ActionBar.f6.v0(i9, b6Var);
            this.e = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.q8[e(j10)], b6Var);
        }
        this.g = j10 == 5;
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

    public final void s(int i9) {
        MessagesController.PeerColors peerColors;
        z10 z10Var = this.f;
        if (z10Var != null) {
            this.b = false;
            this.c = true;
        } else {
            this.b = true;
            this.c = false;
        }
        int[][] iArr = C;
        org.telegram.ui.ActionBar.b6 b6Var = this.z;
        if (i9 < 14) {
            if (z10Var != null) {
                int[] iArr2 = iArr[e(i9)];
                this.f.d(iArr2[0], iArr2[1], iArr2[2], iArr2[3]);
                return;
            } else {
                long j10 = i9;
                this.d = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.p8[e(j10)], b6Var);
                this.e = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.q8[e(j10)], b6Var);
                return;
            }
        }
        MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
        if (messagesController == null || (peerColors = messagesController.peerColors) == null || peerColors.getColor(i9) == null) {
            if (this.f != null) {
                int[] iArr3 = iArr[e(i9)];
                this.f.d(iArr3[0], iArr3[1], iArr3[2], iArr3[3]);
                return;
            } else {
                long j11 = i9;
                this.d = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.p8[e(j11)], b6Var);
                this.e = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.q8[e(j11)], b6Var);
                return;
            }
        }
        int color1 = messagesController.peerColors.getColor(i9).getColor1();
        if (this.f != null) {
            int[] iArr4 = iArr[f(color1)];
            this.f.d(iArr4[0], iArr4[1], iArr4[2], iArr4[3]);
        } else {
            this.d = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.p8[f(color1)], b6Var);
            this.e = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.q8[f(color1)], b6Var);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i9) {
        this.y = i9;
    }

    public final void t() {
        this.l = true;
    }

    public final void u(int i9) {
        this.a.setTextSize(i9);
    }

    public z8(int i9, TLRPC.User user) {
        this((org.telegram.ui.ActionBar.b6) null);
        this.l = false;
        if (user != null) {
            o(user.id, user.first_name, user.last_name, null, null);
            this.m = UserObject.isDeleted(user);
        }
    }

    public z8(TLRPC.Chat chat) {
        this((org.telegram.ui.ActionBar.b6) null);
        this.l = false;
        q(chat);
    }

    public z8(org.telegram.ui.ActionBar.b6 b6Var) {
        this.p = 1.0f;
        this.q = new StringBuilder(5);
        this.r = -1;
        this.w = true;
        this.x = false;
        this.y = 255;
        this.z = b6Var;
        TextPaint textPaint = new TextPaint(1);
        this.a = textPaint;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(18.0f));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
