package fg;

import java.util.Comparator;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ int c;

    public /* synthetic */ d(MessagesController messagesController, int i10, int i11) {
        this.a = i11;
        this.b = messagesController;
        this.c = i10;
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
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        switch (this.a) {
            case 0:
                Long valueOf = Long.valueOf(((TLRPC.TL_contact) obj2).user_id);
                MessagesController messagesController = this.b;
                TLRPC.User user = messagesController.getUser(valueOf);
                TLRPC.User user2 = messagesController.getUser(Long.valueOf(((TLRPC.TL_contact) obj).user_id));
                int i16 = this.c;
                if (user != null) {
                    if (user.self) {
                        i10 = i16 + 50000;
                    } else {
                        TLRPC.UserStatus userStatus = user.status;
                        if (userStatus != null) {
                            i10 = userStatus.expires;
                        }
                    }
                    if (user2 != null) {
                        if (user2.self) {
                            i11 = i16 + 50000;
                        } else {
                            TLRPC.UserStatus userStatus2 = user2.status;
                            if (userStatus2 != null) {
                                i11 = userStatus2.expires;
                            }
                        }
                        if (i10 > 0 || i11 <= 0) {
                            if (i10 < 0 || i11 >= 0) {
                                if ((i10 < 0 || i11 <= 0) && (i10 != 0 || i11 == 0)) {
                                    if ((i11 < 0 || i10 <= 0) && (i11 != 0 || i10 == 0)) {
                                    }
                                }
                            } else if (i10 <= i11) {
                                if (i10 < i11) {
                                }
                            }
                        } else if (i10 <= i11) {
                            if (i10 < i11) {
                            }
                        }
                    }
                    i11 = 0;
                    if (i10 > 0) {
                    }
                    if (i10 < 0) {
                    }
                    if (i10 < 0) {
                    }
                    if (i11 < 0) {
                    }
                }
                i10 = 0;
                if (user2 != null) {
                }
                i11 = 0;
                if (i10 > 0) {
                }
                if (i10 < 0) {
                }
                if (i10 < 0) {
                }
                if (i11 < 0) {
                }
                break;
            case 1:
                Long valueOf2 = Long.valueOf(((TLRPC.TL_contact) obj2).user_id);
                MessagesController messagesController2 = this.b;
                TLRPC.User user3 = messagesController2.getUser(valueOf2);
                TLRPC.User user4 = messagesController2.getUser(Long.valueOf(((TLRPC.TL_contact) obj).user_id));
                int i17 = this.c;
                if (user3 != null) {
                    if (user3.self) {
                        i12 = i17 + 50000;
                    } else {
                        TLRPC.UserStatus userStatus3 = user3.status;
                        if (userStatus3 != null) {
                            i12 = userStatus3.expires;
                        }
                    }
                    if (user4 != null) {
                        if (user4.self) {
                            i13 = i17 + 50000;
                        } else {
                            TLRPC.UserStatus userStatus4 = user4.status;
                            if (userStatus4 != null) {
                                i13 = userStatus4.expires;
                            }
                        }
                        if (i12 > 0 || i13 <= 0) {
                            if (i12 < 0 || i13 >= 0) {
                                if ((i12 < 0 || i13 <= 0) && (i12 != 0 || i13 == 0)) {
                                    if (i13 >= 0 || i12 != 0) {
                                    }
                                }
                            } else if (i12 <= i13) {
                                if (i12 < i13) {
                                }
                            }
                        } else if (i12 <= i13) {
                            if (i12 < i13) {
                            }
                        }
                    }
                    i13 = 0;
                    if (i12 > 0) {
                    }
                    if (i12 < 0) {
                    }
                    if (i12 < 0) {
                    }
                    if (i13 >= 0) {
                    }
                }
                i12 = 0;
                if (user4 != null) {
                }
                i13 = 0;
                if (i12 > 0) {
                }
                if (i12 < 0) {
                }
                if (i12 < 0) {
                }
                if (i13 >= 0) {
                }
                break;
            default:
                TLObject tLObject = (TLObject) obj;
                TLObject tLObject2 = (TLObject) obj2;
                boolean z10 = tLObject2 instanceof TLRPC.TL_contact;
                MessagesController messagesController3 = this.b;
                TLRPC.User user5 = z10 ? messagesController3.getUser(Long.valueOf(((TLRPC.TL_contact) tLObject2).user_id)) : null;
                TLRPC.User user6 = tLObject instanceof TLRPC.TL_contact ? messagesController3.getUser(Long.valueOf(((TLRPC.TL_contact) tLObject).user_id)) : null;
                int i18 = this.c;
                if (user5 != null) {
                    if (user5.self) {
                        i14 = i18 + 50000;
                    } else {
                        TLRPC.UserStatus userStatus5 = user5.status;
                        if (userStatus5 != null) {
                            i14 = userStatus5.expires;
                        }
                    }
                    if (user6 != null) {
                        if (user6.self) {
                            i15 = i18 + 50000;
                        } else {
                            TLRPC.UserStatus userStatus6 = user6.status;
                            if (userStatus6 != null) {
                                i15 = userStatus6.expires;
                            }
                        }
                        if (i14 > 0 || i15 <= 0) {
                            if (i14 < 0 || i15 >= 0) {
                                if ((i14 < 0 || i15 <= 0) && (i14 != 0 || i15 == 0)) {
                                    if (i15 >= 0 || i14 != 0) {
                                    }
                                }
                            } else if (i14 <= i15) {
                                if (i14 < i15) {
                                }
                            }
                        } else if (i14 <= i15) {
                            if (i14 < i15) {
                            }
                        }
                    }
                    i15 = 0;
                    if (i14 > 0) {
                    }
                    if (i14 < 0) {
                    }
                    if (i14 < 0) {
                    }
                    if (i15 >= 0) {
                    }
                }
                i14 = 0;
                if (user6 != null) {
                }
                i15 = 0;
                if (i14 > 0) {
                }
                if (i14 < 0) {
                }
                if (i14 < 0) {
                }
                if (i15 >= 0) {
                }
                break;
        }
        return 0;
    }
}
