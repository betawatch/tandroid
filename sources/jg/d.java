package jg;

import java.util.Comparator;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ mp b;
    public final /* synthetic */ int c;

    public /* synthetic */ d(mp mpVar, int i7, int i10) {
        this.a = i10;
        this.b = mpVar;
        this.c = i7;
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
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        switch (this.a) {
            case 0:
                Long valueOf = Long.valueOf(((TLRPC.TL_contact) obj2).user_id);
                mp mpVar = this.b;
                TLRPC.User c22 = mpVar.c2(valueOf);
                TLRPC.User c23 = mpVar.c2(Long.valueOf(((TLRPC.TL_contact) obj).user_id));
                int i15 = this.c;
                if (c22 != null) {
                    if (c22.self) {
                        i7 = i15 + 50000;
                    } else {
                        TLRPC.UserStatus userStatus = c22.status;
                        if (userStatus != null) {
                            i7 = userStatus.expires;
                        }
                    }
                    if (c23 != null) {
                        if (c23.self) {
                            i10 = i15 + 50000;
                        } else {
                            TLRPC.UserStatus userStatus2 = c23.status;
                            if (userStatus2 != null) {
                                i10 = userStatus2.expires;
                            }
                        }
                        if (i7 > 0 || i10 <= 0) {
                            if (i7 < 0 || i10 >= 0) {
                                if ((i7 < 0 || i10 <= 0) && (i7 != 0 || i10 == 0)) {
                                    if ((i10 < 0 || i7 <= 0) && (i10 != 0 || i7 == 0)) {
                                    }
                                }
                            } else if (i7 <= i10) {
                                if (i7 < i10) {
                                }
                            }
                        } else if (i7 <= i10) {
                            if (i7 < i10) {
                            }
                        }
                    }
                    i10 = 0;
                    if (i7 > 0) {
                    }
                    if (i7 < 0) {
                    }
                    if (i7 < 0) {
                    }
                    if (i10 < 0) {
                    }
                }
                i7 = 0;
                if (c23 != null) {
                }
                i10 = 0;
                if (i7 > 0) {
                }
                if (i7 < 0) {
                }
                if (i7 < 0) {
                }
                if (i10 < 0) {
                }
                break;
            case 1:
                Long valueOf2 = Long.valueOf(((TLRPC.TL_contact) obj2).user_id);
                mp mpVar2 = this.b;
                TLRPC.User c24 = mpVar2.c2(valueOf2);
                TLRPC.User c25 = mpVar2.c2(Long.valueOf(((TLRPC.TL_contact) obj).user_id));
                int i16 = this.c;
                if (c24 != null) {
                    if (c24.self) {
                        i11 = i16 + 50000;
                    } else {
                        TLRPC.UserStatus userStatus3 = c24.status;
                        if (userStatus3 != null) {
                            i11 = userStatus3.expires;
                        }
                    }
                    if (c25 != null) {
                        if (c25.self) {
                            i12 = i16 + 50000;
                        } else {
                            TLRPC.UserStatus userStatus4 = c25.status;
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
                if (c25 != null) {
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
                mp mpVar3 = this.b;
                TLRPC.User c26 = z10 ? mpVar3.c2(Long.valueOf(((TLRPC.TL_contact) tLObject2).user_id)) : null;
                TLRPC.User c27 = tLObject instanceof TLRPC.TL_contact ? mpVar3.c2(Long.valueOf(((TLRPC.TL_contact) tLObject).user_id)) : null;
                int i17 = this.c;
                if (c26 != null) {
                    if (c26.self) {
                        i13 = i17 + 50000;
                    } else {
                        TLRPC.UserStatus userStatus5 = c26.status;
                        if (userStatus5 != null) {
                            i13 = userStatus5.expires;
                        }
                    }
                    if (c27 != null) {
                        if (c27.self) {
                            i14 = i17 + 50000;
                        } else {
                            TLRPC.UserStatus userStatus6 = c27.status;
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
                if (c27 != null) {
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
