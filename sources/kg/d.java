package kg;

import java.util.Comparator;
import org.telegram.messenger.hp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ hp b;
    public final /* synthetic */ int c;

    public /* synthetic */ d(hp hpVar, int i3, int i10) {
        this.a = i10;
        this.b = hpVar;
        this.c = i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x012b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0135 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0075 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00bc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00da A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0121 A[ADDED_TO_REGION] */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(Object obj, Object obj2) {
        int i3;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        switch (this.a) {
            case 0:
                Long valueOf = Long.valueOf(((TLRPC.TL_contact) obj2).user_id);
                hp hpVar = this.b;
                TLRPC.User a22 = hpVar.a2(valueOf);
                TLRPC.User a23 = hpVar.a2(Long.valueOf(((TLRPC.TL_contact) obj).user_id));
                int i15 = this.c;
                if (a22 != null) {
                    if (a22.self) {
                        i3 = i15 + 50000;
                    } else {
                        TLRPC.UserStatus userStatus = a22.status;
                        if (userStatus != null) {
                            i3 = userStatus.expires;
                        }
                    }
                    if (a23 != null) {
                        if (a23.self) {
                            i10 = i15 + 50000;
                        } else {
                            TLRPC.UserStatus userStatus2 = a23.status;
                            if (userStatus2 != null) {
                                i10 = userStatus2.expires;
                            }
                        }
                        if (i3 > 0 || i10 <= 0) {
                            if (i3 < 0 || i10 >= 0) {
                                if ((i3 < 0 || i10 <= 0) && (i3 != 0 || i10 == 0)) {
                                    if ((i10 < 0 || i3 <= 0) && (i10 != 0 || i3 == 0)) {
                                    }
                                }
                            } else if (i3 <= i10) {
                                if (i3 < i10) {
                                }
                            }
                        } else if (i3 <= i10) {
                            if (i3 < i10) {
                            }
                        }
                    }
                    i10 = 0;
                    if (i3 > 0) {
                    }
                    if (i3 < 0) {
                    }
                    if (i3 < 0) {
                    }
                    if (i10 < 0) {
                    }
                }
                i3 = 0;
                if (a23 != null) {
                }
                i10 = 0;
                if (i3 > 0) {
                }
                if (i3 < 0) {
                }
                if (i3 < 0) {
                }
                if (i10 < 0) {
                }
                break;
            case 1:
                Long valueOf2 = Long.valueOf(((TLRPC.TL_contact) obj2).user_id);
                hp hpVar2 = this.b;
                TLRPC.User a24 = hpVar2.a2(valueOf2);
                TLRPC.User a25 = hpVar2.a2(Long.valueOf(((TLRPC.TL_contact) obj).user_id));
                int i16 = this.c;
                if (a24 != null) {
                    if (a24.self) {
                        i11 = i16 + 50000;
                    } else {
                        TLRPC.UserStatus userStatus3 = a24.status;
                        if (userStatus3 != null) {
                            i11 = userStatus3.expires;
                        }
                    }
                    if (a25 != null) {
                        if (a25.self) {
                            i12 = i16 + 50000;
                        } else {
                            TLRPC.UserStatus userStatus4 = a25.status;
                            if (userStatus4 != null) {
                                i12 = userStatus4.expires;
                            }
                        }
                        if (i11 > 0 || i12 <= 0) {
                            if (i11 < 0 || i12 >= 0) {
                                if ((i11 < 0 || i12 <= 0) && (i11 != 0 || i12 == 0)) {
                                    if (i12 >= 0 || i11 != 0) {
                                    }
                                }
                            } else if (i11 <= i12) {
                                if (i11 < i12) {
                                }
                            }
                        } else if (i11 <= i12) {
                            if (i11 < i12) {
                            }
                        }
                    }
                    i12 = 0;
                    if (i11 > 0) {
                    }
                    if (i11 < 0) {
                    }
                    if (i11 < 0) {
                    }
                    if (i12 >= 0) {
                    }
                }
                i11 = 0;
                if (a25 != null) {
                }
                i12 = 0;
                if (i11 > 0) {
                }
                if (i11 < 0) {
                }
                if (i11 < 0) {
                }
                if (i12 >= 0) {
                }
                break;
            default:
                TLObject tLObject = (TLObject) obj;
                TLObject tLObject2 = (TLObject) obj2;
                boolean z10 = tLObject2 instanceof TLRPC.TL_contact;
                hp hpVar3 = this.b;
                TLRPC.User a26 = z10 ? hpVar3.a2(Long.valueOf(((TLRPC.TL_contact) tLObject2).user_id)) : null;
                TLRPC.User a27 = tLObject instanceof TLRPC.TL_contact ? hpVar3.a2(Long.valueOf(((TLRPC.TL_contact) tLObject).user_id)) : null;
                int i17 = this.c;
                if (a26 != null) {
                    if (a26.self) {
                        i13 = i17 + 50000;
                    } else {
                        TLRPC.UserStatus userStatus5 = a26.status;
                        if (userStatus5 != null) {
                            i13 = userStatus5.expires;
                        }
                    }
                    if (a27 != null) {
                        if (a27.self) {
                            i14 = i17 + 50000;
                        } else {
                            TLRPC.UserStatus userStatus6 = a27.status;
                            if (userStatus6 != null) {
                                i14 = userStatus6.expires;
                            }
                        }
                        if (i13 > 0 || i14 <= 0) {
                            if (i13 < 0 || i14 >= 0) {
                                if ((i13 < 0 || i14 <= 0) && (i13 != 0 || i14 == 0)) {
                                    if (i14 >= 0 || i13 != 0) {
                                    }
                                }
                            } else if (i13 <= i14) {
                                if (i13 < i14) {
                                }
                            }
                        } else if (i13 <= i14) {
                            if (i13 < i14) {
                            }
                        }
                    }
                    i14 = 0;
                    if (i13 > 0) {
                    }
                    if (i13 < 0) {
                    }
                    if (i13 < 0) {
                    }
                    if (i14 >= 0) {
                    }
                }
                i13 = 0;
                if (a27 != null) {
                }
                i14 = 0;
                if (i13 > 0) {
                }
                if (i13 < 0) {
                }
                if (i13 < 0) {
                }
                if (i14 >= 0) {
                }
                break;
        }
        return 0;
    }
}
