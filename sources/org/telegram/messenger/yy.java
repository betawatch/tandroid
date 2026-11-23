package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class yy {
    public int A;
    public int B;
    public int C;
    public Object D;
    public cj E;
    public boolean F;
    public boolean G;
    public TL_stories.StoryItem H;
    public TL_stories.StoryItem I;
    public org.telegram.ui.rm J;
    public cw K;
    public boolean L;
    public String M;
    public int N;
    public long O;
    public long P;
    public long Q;
    public long R;
    public boolean S;
    public lj T;
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
    public f20 e;
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
    public gj r;
    public gj s;
    public TLRPC.WebPage t;
    public boolean u;
    public gj v;
    public ArrayList w;
    public TLRPC.ReplyMarkup x;
    public HashMap y;
    public boolean z;

    public static yy a(long j3, String str) {
        return c(str, null, null, null, null, null, null, null, null, null, j3, null, null, null, null, true, null, null, null, null, false, 0, 0, 0, null, null, false, false);
    }

    public static yy b(String str, long j3, gj gjVar, gj gjVar2, TLRPC.WebPage webPage, boolean z10, ArrayList arrayList, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z11, int i7, int i10, cj cjVar, boolean z12) {
        return c(str, null, null, null, null, null, null, null, null, null, j3, null, gjVar, gjVar2, webPage, z10, null, arrayList, replyMarkup, hashMap, z11, i7, i10, 0, null, cjVar, z12, false);
    }

    public static yy c(String str, String str2, TLRPC.MessageMedia messageMedia, TLRPC.TL_photo tL_photo, f20 f20Var, TLRPC.User user, TLRPC.TL_document tL_document, TLRPC.TL_game tL_game, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, TLRPC.TL_messageMediaInvoice tL_messageMediaInvoice, long j3, String str3, gj gjVar, gj gjVar2, TLRPC.WebPage webPage, boolean z10, gj gjVar3, ArrayList arrayList, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z11, int i7, int i10, int i11, Object obj, cj cjVar, boolean z12, boolean z13) {
        yy yyVar = new yy();
        yyVar.a = str;
        yyVar.b = str2;
        yyVar.c = messageMedia;
        yyVar.d = tL_photo;
        yyVar.e = f20Var;
        yyVar.f = user;
        yyVar.g = tL_document;
        yyVar.h = tL_game;
        yyVar.i = tL_messageMediaPoll;
        yyVar.m = tL_messageMediaInvoice;
        yyVar.p = j3;
        yyVar.q = str3;
        yyVar.r = gjVar;
        yyVar.s = gjVar2;
        yyVar.t = webPage;
        yyVar.u = z10;
        yyVar.v = gjVar3;
        yyVar.w = arrayList;
        yyVar.x = replyMarkup;
        yyVar.y = hashMap;
        yyVar.z = z11;
        yyVar.A = i7;
        yyVar.B = i10;
        yyVar.C = i11;
        yyVar.D = obj;
        yyVar.E = cjVar;
        yyVar.F = z12;
        yyVar.G = z13;
        return yyVar;
    }

    public static yy d(TLRPC.MessageMedia messageMedia, long j3, gj gjVar, gj gjVar2, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z10, int i7) {
        return c(null, null, messageMedia, null, null, null, null, null, null, null, j3, null, gjVar, gjVar2, null, true, null, null, replyMarkup, hashMap, z10, i7, 0, 0, null, null, false, false);
    }

    public static yy e(TLRPC.TL_document tL_document, f20 f20Var, String str, long j3, gj gjVar, gj gjVar2, String str2, ArrayList arrayList, HashMap hashMap, boolean z10, int i7, int i10, int i11, Object obj, boolean z11) {
        return c(null, str2, null, null, f20Var, null, tL_document, null, null, null, j3, str, gjVar, gjVar2, null, true, null, arrayList, null, hashMap, z10, i7, i10, i11, obj, null, false, z11);
    }

    public static yy f(TLRPC.TL_document tL_document, f20 f20Var, String str, long j3, gj gjVar, gj gjVar2, String str2, ArrayList arrayList, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z10, int i7, int i10, int i11, Object obj, cj cjVar, boolean z11) {
        return c(null, str2, null, null, f20Var, null, tL_document, null, null, null, j3, str, gjVar, gjVar2, null, true, null, arrayList, replyMarkup, hashMap, z10, i7, i10, i11, obj, cjVar, z11, false);
    }

    public static yy g(TLRPC.User user, long j3, gj gjVar, gj gjVar2, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z10, int i7, int i10) {
        return c(null, null, null, null, null, user, null, null, null, null, j3, null, gjVar, gjVar2, null, true, null, null, replyMarkup, hashMap, z10, i7, i10, 0, null, null, false, false);
    }
}
