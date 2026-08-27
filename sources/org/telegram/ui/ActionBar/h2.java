package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.ec;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class h2 implements db {
    public final /* synthetic */ n2 a;

    public h2(n2 n2Var) {
        this.a = n2Var;
    }

    @Override // org.telegram.ui.Components.db
    public final /* synthetic */ boolean a() {
        return true;
    }

    @Override // org.telegram.ui.Components.db
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.db
    public final int f(int i10) {
        if (this.a.isSupportEdgeToEdge()) {
            return AndroidUtilities.navigationBarHeight;
        }
        return 0;
    }

    @Override // org.telegram.ui.Components.db
    public final /* synthetic */ boolean g(int i10) {
        return false;
    }

    @Override // org.telegram.ui.Components.db
    public final /* synthetic */ int h(int i10) {
        return 0;
    }

    @Override // org.telegram.ui.Components.db
    public final /* synthetic */ void b(ec ecVar) {
    }

    @Override // org.telegram.ui.Components.db
    public final /* synthetic */ void c(float f10) {
    }

    @Override // org.telegram.ui.Components.db
    public final /* synthetic */ void d(ec ecVar) {
    }
}
