package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class cz {
    public int A;
    public int B;
    public int C;
    public Object D;
    public cj E;
    public boolean F;
    public boolean G;
    public TL_stories.StoryItem H;
    public TL_stories.StoryItem I;
    public org.telegram.ui.qm J;
    public fw K;
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
    public g20 e;
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

    public static cz a(long j3, String str) {
        return c(str, null, null, null, null, null, null, null, null, null, j3, null, null, null, null, true, null, null, null, null, false, 0, 0, 0, null, null, false, false);
    }

    public static cz b(String str, long j3, gj gjVar, gj gjVar2, TLRPC.WebPage webPage, boolean z10, ArrayList arrayList, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z11, int i7, int i10, cj cjVar, boolean z12) {
        return c(str, null, null, null, null, null, null, null, null, null, j3, null, gjVar, gjVar2, webPage, z10, null, arrayList, replyMarkup, hashMap, z11, i7, i10, 0, null, cjVar, z12, false);
    }

    public static cz c(String str, String str2, TLRPC.MessageMedia messageMedia, TLRPC.TL_photo tL_photo, g20 g20Var, TLRPC.User user, TLRPC.TL_document tL_document, TLRPC.TL_game tL_game, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, TLRPC.TL_messageMediaInvoice tL_messageMediaInvoice, long j3, String str3, gj gjVar, gj gjVar2, TLRPC.WebPage webPage, boolean z10, gj gjVar3, ArrayList arrayList, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z11, int i7, int i10, int i11, Object obj, cj cjVar, boolean z12, boolean z13) {
        cz czVar = new cz();
        czVar.a = str;
        czVar.b = str2;
        czVar.c = messageMedia;
        czVar.d = tL_photo;
        czVar.e = g20Var;
        czVar.f = user;
        czVar.g = tL_document;
        czVar.h = tL_game;
        czVar.i = tL_messageMediaPoll;
        czVar.m = tL_messageMediaInvoice;
        czVar.p = j3;
        czVar.q = str3;
        czVar.r = gjVar;
        czVar.s = gjVar2;
        czVar.t = webPage;
        czVar.u = z10;
        czVar.v = gjVar3;
        czVar.w = arrayList;
        czVar.x = replyMarkup;
        czVar.y = hashMap;
        czVar.z = z11;
        czVar.A = i7;
        czVar.B = i10;
        czVar.C = i11;
        czVar.D = obj;
        czVar.E = cjVar;
        czVar.F = z12;
        czVar.G = z13;
        return czVar;
    }

    public static cz d(TLRPC.MessageMedia messageMedia, long j3, gj gjVar, gj gjVar2, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z10, int i7) {
        return c(null, null, messageMedia, null, null, null, null, null, null, null, j3, null, gjVar, gjVar2, null, true, null, null, replyMarkup, hashMap, z10, i7, 0, 0, null, null, false, false);
    }

    public static cz e(TLRPC.TL_document tL_document, g20 g20Var, String str, long j3, gj gjVar, gj gjVar2, String str2, ArrayList arrayList, HashMap hashMap, boolean z10, int i7, int i10, int i11, Object obj, boolean z11) {
        return c(null, str2, null, null, g20Var, null, tL_document, null, null, null, j3, str, gjVar, gjVar2, null, true, null, arrayList, null, hashMap, z10, i7, i10, i11, obj, null, false, z11);
    }

    public static cz f(TLRPC.TL_document tL_document, g20 g20Var, String str, long j3, gj gjVar, gj gjVar2, String str2, ArrayList arrayList, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z10, int i7, int i10, int i11, Object obj, cj cjVar, boolean z11) {
        return c(null, str2, null, null, g20Var, null, tL_document, null, null, null, j3, str, gjVar, gjVar2, null, true, null, arrayList, replyMarkup, hashMap, z10, i7, i10, i11, obj, cjVar, z11, false);
    }

    public static cz g(TLRPC.User user, long j3, gj gjVar, gj gjVar2, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z10, int i7, int i10) {
        return c(null, null, null, null, null, user, null, null, null, null, j3, null, gjVar, gjVar2, null, true, null, null, replyMarkup, hashMap, z10, i7, i10, 0, null, null, false, false);
    }
}
