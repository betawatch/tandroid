package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class vf implements org.telegram.ui.ou0 {
    public boolean a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ MediaController.PhotoEntry d;
    public final /* synthetic */ xf e;

    public vf(xf xfVar, Object obj, Object obj2, MediaController.PhotoEntry photoEntry) {
        this.e = xfVar;
        this.b = obj;
        this.c = obj2;
        this.d = photoEntry;
    }

    @Override // org.telegram.ui.ou0
    public final boolean A() {
        return this.a;
    }

    @Override // org.telegram.ui.ou0
    public final CharSequence C(int i10) {
        return null;
    }

    @Override // org.telegram.ui.ou0
    public final org.telegram.ui.qu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        return null;
    }

    @Override // org.telegram.ui.ou0
    public final void F(boolean z4) {
        this.a = z4;
    }

    @Override // org.telegram.ui.ou0
    public final int H() {
        return 0;
    }

    @Override // org.telegram.ui.ou0
    public final boolean J() {
        return false;
    }

    @Override // org.telegram.ui.ou0
    public final /* synthetic */ boolean K() {
        return false;
    }

    @Override // org.telegram.ui.ou0
    public final /* synthetic */ boolean M() {
        return true;
    }

    @Override // org.telegram.ui.ou0
    public final /* synthetic */ boolean N() {
        return false;
    }

    @Override // org.telegram.ui.ou0
    public final boolean O() {
        return false;
    }

    @Override // org.telegram.ui.ou0
    public final /* synthetic */ boolean P() {
        return false;
    }

    @Override // org.telegram.ui.ou0
    public final int Q(Object obj) {
        return 0;
    }

    @Override // org.telegram.ui.ou0
    public final int R(int i10) {
        return 0;
    }

    @Override // org.telegram.ui.ou0
    public final boolean S() {
        return false;
    }

    @Override // org.telegram.ui.ou0
    public final boolean T() {
        return true;
    }

    @Override // org.telegram.ui.ou0
    public final MessageObject U() {
        return null;
    }

    @Override // org.telegram.ui.ou0
    public final boolean Y() {
        return false;
    }

    @Override // org.telegram.ui.ou0
    public final /* synthetic */ long a() {
        return 0L;
    }

    @Override // org.telegram.ui.ou0
    public final String a0() {
        return "";
    }

    @Override // org.telegram.ui.ou0
    public final /* synthetic */ boolean b() {
        return false;
    }

    @Override // org.telegram.ui.ou0
    public final CharSequence b0(int i10) {
        return null;
    }

    @Override // org.telegram.ui.ou0
    public final ArrayList c() {
        return null;
    }

    @Override // org.telegram.ui.ou0
    public final void d() {
        qh.f fVar;
        bd f12 = PhotoViewer.t1().f1();
        if (f12 == null || (fVar = f12.f) == null) {
            return;
        }
        au auVar = fVar.a;
        auVar.requestFocus();
        AndroidUtilities.showKeyboard(auVar);
    }

    @Override // org.telegram.ui.ou0
    public final boolean g() {
        return false;
    }

    @Override // org.telegram.ui.ou0
    public final /* synthetic */ boolean h() {
        return false;
    }

    @Override // org.telegram.ui.ou0
    public final ImageReceiver.BitmapHolder j(int i10) {
        return null;
    }

    @Override // org.telegram.ui.ou0
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        return 0;
    }

    @Override // org.telegram.ui.ou0
    public final boolean l() {
        return true;
    }

    @Override // org.telegram.ui.ou0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z4, int i11, int i12, boolean z10) {
        this.e.B(null, this.b, null, this.c, z4, i11, i12, this.d, this.a);
    }

    @Override // org.telegram.ui.ou0
    public final boolean p() {
        return false;
    }

    @Override // org.telegram.ui.ou0
    public final /* synthetic */ boolean q() {
        return false;
    }

    @Override // org.telegram.ui.ou0
    public final boolean r() {
        return false;
    }

    @Override // org.telegram.ui.ou0
    public final /* synthetic */ boolean t() {
        return true;
    }

    @Override // org.telegram.ui.ou0
    public final boolean u() {
        return false;
    }

    @Override // org.telegram.ui.ou0
    public final HashMap v() {
        return null;
    }

    @Override // org.telegram.ui.ou0
    public final /* synthetic */ boolean w() {
        return false;
    }

    @Override // org.telegram.ui.ou0
    public final boolean x(int i10) {
        return false;
    }

    @Override // org.telegram.ui.ou0
    public final int y() {
        return 0;
    }

    @Override // org.telegram.ui.ou0
    public final boolean z() {
        return true;
    }

    @Override // org.telegram.ui.ou0
    public final void B(int i10) {
    }

    @Override // org.telegram.ui.ou0
    public final void D() {
    }

    @Override // org.telegram.ui.ou0
    public final void G() {
    }

    @Override // org.telegram.ui.ou0
    public final /* synthetic */ void I() {
    }

    @Override // org.telegram.ui.ou0
    public final void L(VideoEditedInfo videoEditedInfo) {
    }

    @Override // org.telegram.ui.ou0
    public final /* synthetic */ void V() {
    }

    @Override // org.telegram.ui.ou0
    public final void W(int i10) {
    }

    @Override // org.telegram.ui.ou0
    public final /* synthetic */ void X(int i10) {
    }

    @Override // org.telegram.ui.ou0
    public final void Z(int i10) {
    }

    @Override // org.telegram.ui.ou0
    public final void e(CharSequence charSequence) {
    }

    @Override // org.telegram.ui.ou0
    public final /* synthetic */ void i() {
    }

    @Override // org.telegram.ui.ou0
    public final /* synthetic */ void m() {
    }

    @Override // org.telegram.ui.ou0
    public final void n() {
    }

    @Override // org.telegram.ui.ou0
    public final /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.ou0
    public final void f(String str, String str2, boolean z4) {
    }
}
