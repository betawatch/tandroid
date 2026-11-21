package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class xy {
    public int A;
    public int B;
    public int C;
    public Object D;
    public bj E;
    public boolean F;
    public boolean G;
    public TL_stories.StoryItem H;
    public TL_stories.StoryItem I;
    public org.telegram.ui.rm J;
    public bw K;
    public boolean L;
    public String M;
    public int N;
    public long O;
    public long P;
    public long Q;
    public long R;
    public boolean S;
    public kj T;
    public boolean U;
    public long V;
    public long W;
    public long X;
    public TL_iv.RichMessage Y;
    public ArrayList Z;
    public String a;
    public String b;
    public TLRPC.MessageMedia c;
    public TLRPC.TL_photo d;
    public e20 e;
    public TLRPC.User f;
    public TLRPC.TL_document g;
    public TLRPC.TL_game h;
    public TLRPC.TL_messageMediaPoll i;
    public sh.f j;
    public int k;
    public TLRPC.TL_messageMediaToDo l;
    public TLRPC.TL_messageMediaInvoice m;
    public TLRPC.TL_messageMediaWebPage n;
    public TLRPC.PhotoSize o;
    public long p;
    public String q;
    public fj r;
    public fj s;
    public TLRPC.WebPage t;
    public boolean u;
    public fj v;
    public ArrayList w;
    public TLRPC.ReplyMarkup x;
    public HashMap y;
    public boolean z;

    public static xy a(long j3, String str) {
        return c(str, null, null, null, null, null, null, null, null, null, j3, null, null, null, null, true, null, null, null, null, false, 0, 0, 0, null, null, false, false);
    }

    public static xy b(String str, long j3, fj fjVar, fj fjVar2, TLRPC.WebPage webPage, boolean z10, ArrayList arrayList, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z11, int i7, int i10, bj bjVar, boolean z12) {
        return c(str, null, null, null, null, null, null, null, null, null, j3, null, fjVar, fjVar2, webPage, z10, null, arrayList, replyMarkup, hashMap, z11, i7, i10, 0, null, bjVar, z12, false);
    }

    public static xy c(String str, String str2, TLRPC.MessageMedia messageMedia, TLRPC.TL_photo tL_photo, e20 e20Var, TLRPC.User user, TLRPC.TL_document tL_document, TLRPC.TL_game tL_game, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, TLRPC.TL_messageMediaInvoice tL_messageMediaInvoice, long j3, String str3, fj fjVar, fj fjVar2, TLRPC.WebPage webPage, boolean z10, fj fjVar3, ArrayList arrayList, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z11, int i7, int i10, int i11, Object obj, bj bjVar, boolean z12, boolean z13) {
        xy xyVar = new xy();
        xyVar.a = str;
        xyVar.b = str2;
        xyVar.c = messageMedia;
        xyVar.d = tL_photo;
        xyVar.e = e20Var;
        xyVar.f = user;
        xyVar.g = tL_document;
        xyVar.h = tL_game;
        xyVar.i = tL_messageMediaPoll;
        xyVar.m = tL_messageMediaInvoice;
        xyVar.p = j3;
        xyVar.q = str3;
        xyVar.r = fjVar;
        xyVar.s = fjVar2;
        xyVar.t = webPage;
        xyVar.u = z10;
        xyVar.v = fjVar3;
        xyVar.w = arrayList;
        xyVar.x = replyMarkup;
        xyVar.y = hashMap;
        xyVar.z = z11;
        xyVar.A = i7;
        xyVar.B = i10;
        xyVar.C = i11;
        xyVar.D = obj;
        xyVar.E = bjVar;
        xyVar.F = z12;
        xyVar.G = z13;
        return xyVar;
    }

    public static xy d(TLRPC.MessageMedia messageMedia, long j3, fj fjVar, fj fjVar2, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z10, int i7) {
        return c(null, null, messageMedia, null, null, null, null, null, null, null, j3, null, fjVar, fjVar2, null, true, null, null, replyMarkup, hashMap, z10, i7, 0, 0, null, null, false, false);
    }

    public static xy e(TLRPC.TL_document tL_document, e20 e20Var, String str, long j3, fj fjVar, fj fjVar2, String str2, ArrayList arrayList, HashMap hashMap, boolean z10, int i7, int i10, int i11, Object obj, boolean z11) {
        return c(null, str2, null, null, e20Var, null, tL_document, null, null, null, j3, str, fjVar, fjVar2, null, true, null, arrayList, null, hashMap, z10, i7, i10, i11, obj, null, false, z11);
    }

    public static xy f(TLRPC.TL_document tL_document, e20 e20Var, String str, long j3, fj fjVar, fj fjVar2, String str2, ArrayList arrayList, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z10, int i7, int i10, int i11, Object obj, bj bjVar, boolean z11) {
        return c(null, str2, null, null, e20Var, null, tL_document, null, null, null, j3, str, fjVar, fjVar2, null, true, null, arrayList, replyMarkup, hashMap, z10, i7, i10, i11, obj, bjVar, z11, false);
    }

    public static xy g(TLRPC.User user, long j3, fj fjVar, fj fjVar2, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z10, int i7, int i10) {
        return c(null, null, null, null, null, user, null, null, null, null, j3, null, fjVar, fjVar2, null, true, null, null, replyMarkup, hashMap, z10, i7, i10, 0, null, null, false, false);
    }
}
